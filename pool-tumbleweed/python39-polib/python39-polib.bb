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

RPM_NAME = "python39-polib-1.1.1-2.1.noarch.rpm"
RPM_HASH = "92d97db27dcf383274d54a941113da6be9a55f617a5cfb5d2ff7955b426ceec26b792ac7c450344d2b2ba17aca52f75af6bcf22c481333e038ea30f44f6dc08a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-polib \
python39-polib \
python3dist-polib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
