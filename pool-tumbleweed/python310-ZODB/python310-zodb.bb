SUMMARY = "Zope Object Database: object database and persistence"
DESCRIPTION = "The Zope Object Database provides an object-oriented database for Python that \
provides a high-degree of transparency. Applications can take advantage of \
object database features with few, if any, changes to application logic. ZODB \
includes features such as a plugable storage interface, rich transaction \
support, and undo."
LICENSE = "ZPL-2.1"

PV = "5.8.0"

RPM_NAME = "python310-ZODB-5.8.0-1.6.noarch.rpm"
RPM_HASH = "43a29f725424fccf4527f66813bf48d226c3308aee66716170d4789cb3cbd99475da596d8458e9bf252317ac7bec3f08bf558cd6ccf9274f636154355f1492eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zodb \
python310-ZODB \
python3dist-zodb"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
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
