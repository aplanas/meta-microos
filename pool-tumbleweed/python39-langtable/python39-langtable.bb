SUMMARY = "Database to guess defaults for locale settings"
DESCRIPTION = "langtable is used to guess reasonable defaults for locale, keyboard layout, \
territory, and language, if part of that information is already known. For \
example, guess the territory and the keyboard layout if the language \
is known or guess the language and keyboard layout if the territory is \
already known."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.61"

RPM_NAME = "python39-langtable-0.0.61-2.2.noarch.rpm"
RPM_HASH = "47b53fbf893c98ceb7b13a5f62cdb4901abb10c98e380bac9594551398e40e52a879fe6638810dbb3ddf9849824e072b6bf8537fcfac6f40daf89ce1c3d560ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-langtable \
python39-langtable \
python3dist-langtable"

RDEPENDS:${PN} += "python-abi \
python-langtable-data"

inherit rpm
