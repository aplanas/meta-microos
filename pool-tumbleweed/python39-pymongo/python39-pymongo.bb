SUMMARY = "Python driver for MongoDB"
DESCRIPTION = "The PyMongo distribution contains tools for interacting with MongoDB \
database from Python.  The bson package is an implementation of \
the BSON format for Python. The pymongo package is a native Python \
driver for MongoDB. The gridfs package is a gridfs \
implementation on top of pymongo."
LICENSE = "Apache-2.0"

PV = "4.3.3"

RPM_NAME = "python39-pymongo-4.3.3-1.4.aarch64.rpm"
RPM_HASH = "e7ca794eea29587b031c478f113de69924b91dd8fb08b025da84119763d8d0d68cde01ccd9e1f05b8035b69dc80f23d422660d092aa1cff41832709e4d4580f2"

RPROVIDES:${PN} += "python3.9dist(pymongo) \
python39-pymongo \
python39-pymongo(aarch-64) \
python3dist(pymongo)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
