SUMMARY = "Python driver for MongoDB"
DESCRIPTION = "The PyMongo distribution contains tools for interacting with MongoDB \
database from Python.  The bson package is an implementation of \
the BSON format for Python. The pymongo package is a native Python \
driver for MongoDB. The gridfs package is a gridfs \
implementation on top of pymongo."
LICENSE = "Apache-2.0"

PV = "4.3.3"

RPM_NAME = "python311-pymongo-4.3.3-2.3.aarch64.rpm"
RPM_HASH = "bd78c6dc03f978e2545309ce768c4e184667c0d7a5470bd623d0a87cb419da495a356e7e9dc2accaa771020a96cb280cd1f9a9967bcd81ddfe4df05cdb1a1911"

RPROVIDES:${PN} += "python3-pymongo \
python3.11dist-pymongo \
python311-pymongo \
python3dist-pymongo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
