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

RPM_NAME = "python310-polib-1.1.1-1.9.noarch.rpm"
RPM_HASH = "bf97f6aae0957e5752a98766947660ae98eca337bcff07b9164518325c61ac1db7629cb7c9ea0231f0af1452bd717e8f4abe41d34a2246cf59fda1cc0c2c7aff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-polib \
python310-polib \
python3dist-polib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
