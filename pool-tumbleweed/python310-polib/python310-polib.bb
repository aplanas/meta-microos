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

RPM_NAME = "python310-polib-1.1.1-2.1.noarch.rpm"
RPM_HASH = "abc9cc105273b4608902346084216ae404a16a923cdbe94a219f85c2ed172bcd26b9cef330e6e3b0ccd540eff96362de1de90c31a4830e3221cd8ffc4bdba77f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-polib \
python310-polib \
python3dist-polib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
