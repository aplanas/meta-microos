SUMMARY = "A library to manipulate gettext files"
DESCRIPTION = "polib allows you to manipulate, create, modify gettext catalogs (.pot, .po and \
binary .mo files). You can load existing files, iterate through it's entries, \
add, modify entries, comments or metadata, etc... or create new po/pot files \
from scratch. \
 \
polib provides a simple and pythonic API, exporting only two convenience \
functions 'pofile' and 'mofile', and the 4 core classes: POFile, MOFile, \
POEntry and MOEntry for creating new files/entries."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-polib-1.1.1-1.8.noarch.rpm"
RPM_HASH = "247fbe5fe905b4dd275642078ebacf96c06216856c2966dec1b72113152eeef783eb08b3647fff011a7b636345dffac4d0fd2cda18350af5bff1543c975412dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(polib) \
python311-polib \
python3dist(polib)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
