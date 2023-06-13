SUMMARY = "Python driver for MongoDB"
DESCRIPTION = "The PyMongo distribution contains tools for interacting with MongoDB \
database from Python.  The bson package is an implementation of \
the BSON format for Python. The pymongo package is a native Python \
driver for MongoDB. The gridfs package is a gridfs \
implementation on top of pymongo."
LICENSE = "Apache-2.0"

PV = "4.3.3"

RPM_NAME = "python311-pymongo-4.3.3-1.4.aarch64.rpm"
RPM_HASH = "7c11e322030ec930f668ef6fe7941c18738272d23409db40e4681de977ed8c1d3e47710b184caccb87d9ee1b9d87a9536ea6daddf353e5ac80407a2b61835211"

RPROVIDES:${PN} += "python3.11dist(pymongo) \
python311-pymongo \
python311-pymongo(aarch-64) \
python3dist(pymongo)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
