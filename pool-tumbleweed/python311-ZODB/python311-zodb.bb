SUMMARY = "Zope Object Database: object database and persistence"
DESCRIPTION = "The Zope Object Database provides an object-oriented database for Python that \
provides a high-degree of transparency. Applications can take advantage of \
object database features with few, if any, changes to application logic. ZODB \
includes features such as a plugable storage interface, rich transaction \
support, and undo."
LICENSE = "ZPL-2.1"

PV = "5.8.0"

RPM_NAME = "python311-ZODB-5.8.0-1.6.noarch.rpm"
RPM_HASH = "e36d032df61264e1bfe33fe9fe3aea43570843d370aba1c5c1bdfad5f9f0eefbb80bb17477e758e38fd11926ca3672862a585f54a4cecc721b0120b42f716028"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ZODB \
python3.11dist-zodb \
python311-ZODB \
python3dist-zodb"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-BTrees \
python311-ZConfig \
python311-persistent \
python311-six \
python311-transaction \
python311-zc.lockfile \
python311-zodbpickle \
python311-zope.interface \
update-alternatives"

inherit rpm
