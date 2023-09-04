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

RPM_NAME = "python311-polib-1.1.1-2.1.noarch.rpm"
RPM_HASH = "a86de5884b60fd0c6fe0c806c5a530318483f90ff365d44d1ea7f03b14ce6400d670741f61324d67c6d3026a34d481190b5c2faae79bddfbc5ff4029ca5dd9a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-polib \
python3.11dist-polib \
python311-polib \
python3dist-polib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
