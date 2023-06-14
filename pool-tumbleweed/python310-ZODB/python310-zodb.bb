SUMMARY = "Zope Object Database: object database and persistence"
DESCRIPTION = "The Zope Object Database provides an object-oriented database for Python that \
provides a high-degree of transparency. Applications can take advantage of \
object database features with few, if any, changes to application logic. ZODB \
includes features such as a plugable storage interface, rich transaction \
support, and undo."
LICENSE = "ZPL-2.1"

PV = "5.8.0"

RPM_NAME = "python310-ZODB-5.8.0-1.4.noarch.rpm"
RPM_HASH = "7f411b006635d019898062673315b156763930f6978fe2250555cd62028e3c9cee3e68a1eb8929c4fae59f4ac4a6d0989b6cbcc6a75a43068dbd854bd40ba71e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ZODB \
python3.10dist-zodb \
python310-ZODB \
python3dist-zodb"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-BTrees \
python310-ZConfig \
python310-persistent \
python310-six \
python310-transaction \
python310-zc.lockfile \
python310-zodbpickle \
python310-zope.interface \
update-alternatives"

inherit rpm
