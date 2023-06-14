SUMMARY = "Zope Object Database: object database and persistence"
DESCRIPTION = "The Zope Object Database provides an object-oriented database for Python that \
provides a high-degree of transparency. Applications can take advantage of \
object database features with few, if any, changes to application logic. ZODB \
includes features such as a plugable storage interface, rich transaction \
support, and undo."
LICENSE = "ZPL-2.1"

PV = "5.8.0"

RPM_NAME = "python39-ZODB-5.8.0-1.4.noarch.rpm"
RPM_HASH = "50a8cd1054e11e4e830c485931c7d1692fe7ee67b1e18cdecf08ea3f7f72389c4b9085554f350acce0da3b806388f855e6e0a4ece899a97ba831cc139e718e19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zodb \
python39-ZODB \
python3dist-zodb"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
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
