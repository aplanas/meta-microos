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

RPM_NAME = "python39-polib-1.1.1-1.9.noarch.rpm"
RPM_HASH = "332c52caac9873e8c658f1dfb39c14244aa381022cd271c01fdebb2076b2c9e58d78a1bb0300955a12d79cae9642d6fc46c0407608be4b7f41b51f2a49ea1f36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-polib \
python39-polib \
python3dist-polib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
