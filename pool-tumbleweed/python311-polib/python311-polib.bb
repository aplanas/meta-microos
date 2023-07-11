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

RPM_NAME = "python311-polib-1.1.1-1.9.noarch.rpm"
RPM_HASH = "dbc01d691f38b03784eb43c09bb9ae6c93df100a4068c8d864a76245f45d4faa6f10dcfb50004f49382cfb3c8259ea855fe20f3e84eeeeaea68c314defdc2e44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-polib \
python3.11dist-polib \
python311-polib \
python3dist-polib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
