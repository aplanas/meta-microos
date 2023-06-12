SUMMARY = "Zope Object Database: object database and persistence"
DESCRIPTION = "This package contains documentation files for python-ZODB."
LICENSE = "ZPL-2.1"

PV = "5.8.0"

RPM_NAME = "python-ZODB-doc-5.8.0-1.4.noarch.rpm"
RPM_HASH = "1f3386a122396e6df96d3f92209261899a45b16cae49ad643f460184ee5264a7c247769bf6093fceab6a98405a152610018727b8439693cbd74f6bd407c0f7bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-ZODB-doc \
python310-ZODB-doc \
python311-ZODB-doc \
python39-ZODB-doc"
RDEPENDS:${PN} += ""

inherit rpm
