SUMMARY = "Database to guess defaults for locale settings"
DESCRIPTION = "langtable is used to guess reasonable defaults for locale, keyboard layout, \
territory, and language, if part of that information is already known. For \
example, guess the territory and the keyboard layout if the language \
is known or guess the language and keyboard layout if the territory is \
already known."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.61"

RPM_NAME = "python39-langtable-0.0.61-2.1.noarch.rpm"
RPM_HASH = "5d8b191ec14cfd5714532b4e4b4d1eb866938629a594930af4ade5b9656223fb9e1af4f0aadd4187411f784865b221757d0d39ddebda235f3558a765f43a941d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-langtable \
python39-langtable \
python3dist-langtable"

RDEPENDS:${PN} += "python-abi \
python-langtable-data"

inherit rpm
