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

RPM_NAME = "python310-polib-1.1.1-1.8.noarch.rpm"
RPM_HASH = "bef07752de978d6831d595e4214b3cfaf104b2002a7e6b77f725b6a1839f8ecc5c67b4502073f4046f7a259e0fc866fc7f1ea443cc712f5abd09d50a73176aec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-polib \
python3.10dist(polib) \
python310-polib \
python3dist(polib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
