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

RPM_NAME = "python-polib-doc-1.1.1-1.9.noarch.rpm"
RPM_HASH = "6d1b48f1c4fe201a42c89c21470b00f0afe5a09be60a13ad31d7a49d528fcc2f26ed213a250398b314156e27c7e8a8b70eea8c00c27c42ae05c93f97a75e97ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-polib-doc \
python310-polib-doc \
python311-polib-doc \
python39-polib-doc"

RDEPENDS:${PN} += ""

inherit rpm
