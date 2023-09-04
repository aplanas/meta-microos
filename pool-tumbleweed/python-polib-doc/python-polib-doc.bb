SUMMARY = "A library to manipulate gettext files - documentation"
DESCRIPTION = "polib allows you to manipulate, create, modify gettext catalogs (.pot, .po and \
binary .mo files). You can load existing files, iterate through it's entries, \
add, modify entries, comments or metadata, etc... or create new po/pot files \
from scratch. \
 \
polib provides a simple and pythonic API, exporting only two convenience \
functions 'pofile' and 'mofile', and the 4 core classes: POFile, MOFile, \
POEntry and MOEntry for creating new files/entries. \
 \
This package contains documentation in HTML format."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python-polib-doc-1.1.1-2.1.noarch.rpm"
RPM_HASH = "de80ee5c615153f2a0ef0f01bb8c503f32fc25ab47112867aefc42aef3d4fc00432868202507fbae8aa22f5f59800d0fc58bae98f9e93ba5afd9e1e130f2eaa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-polib-doc \
python310-polib-doc \
python311-polib-doc \
python39-polib-doc"

RDEPENDS:${PN} += ""

inherit rpm
