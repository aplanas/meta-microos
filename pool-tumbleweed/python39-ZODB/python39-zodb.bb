SUMMARY = "Zope Object Database: object database and persistence"
DESCRIPTION = "The Zope Object Database provides an object-oriented database for Python that \
provides a high-degree of transparency. Applications can take advantage of \
object database features with few, if any, changes to application logic. ZODB \
includes features such as a plugable storage interface, rich transaction \
support, and undo."
LICENSE = "ZPL-2.1"

PV = "5.8.0"

RPM_NAME = "python39-ZODB-5.8.0-1.6.noarch.rpm"
RPM_HASH = "4ba6f9fef81441f586cc0fe4fd9c5334885112ceb8db1ff99174cfed7db5729e5a2b07b170e91227eb644bcb744d0ec27f10961001ea6fcbb6ae3b3b3098edae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zodb \
python39-ZODB \
python3dist-zodb"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-BTrees \
python39-ZConfig \
python39-persistent \
python39-six \
python39-transaction \
python39-zc.lockfile \
python39-zodbpickle \
python39-zope.interface \
update-alternatives"

inherit rpm
