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

RPM_NAME = "python-polib-doc-1.1.1-1.8.noarch.rpm"
RPM_HASH = "6906a0f9c3ed588f812bf3dc49e85b02d72204502fda44e94bdb943ed4626a40ee7afcae52a44c1d1acdb27d47f5eab9bca3cd5d23596b2206c5e4c984087741"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-polib-doc \
python310-polib-doc \
python311-polib-doc \
python39-polib-doc"
RDEPENDS:${PN} += ""

inherit rpm
