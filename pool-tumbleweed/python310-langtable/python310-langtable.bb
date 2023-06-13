SUMMARY = "Database to guess defaults for locale settings"
DESCRIPTION = "langtable is used to guess reasonable defaults for locale, keyboard layout, \
territory, and language, if part of that information is already known. For \
example, guess the territory and the keyboard layout if the language \
is known or guess the language and keyboard layout if the territory is \
already known."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.61"

RPM_NAME = "python310-langtable-0.0.61-2.1.noarch.rpm"
RPM_HASH = "216bb87410ca90d08246e52406ef1efb2288acd987a0a1195e9ebfca9a688c453ec68387c58fb24cad7828d26ca361b732b1d946f465ef8facb91272bc1d8f6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-langtable \
python3.10dist(langtable) \
python310-langtable \
python3dist(langtable)"

RDEPENDS:${PN} += "python(abi) \
python-langtable-data"

inherit rpm
