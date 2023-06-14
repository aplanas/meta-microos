SUMMARY = "Zope Object Database: object database and persistence"
DESCRIPTION = "The Zope Object Database provides an object-oriented database for Python that \
provides a high-degree of transparency. Applications can take advantage of \
object database features with few, if any, changes to application logic. ZODB \
includes features such as a plugable storage interface, rich transaction \
support, and undo."
LICENSE = "ZPL-2.1"

PV = "5.8.0"

RPM_NAME = "python311-ZODB-5.8.0-1.4.noarch.rpm"
RPM_HASH = "766238bcf6a8ca5989a506068269bfb2f04f202f587ea1983efd59772735ad8fcb763f0fd592d7ae9a58abb34c75d4d3cdacd00d4288a79a5f0583fb1c6c7cb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-zodb \
python311-ZODB \
python3dist-zodb"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
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
