SUMMARY = "Python driver for MongoDB"
DESCRIPTION = "The PyMongo distribution contains tools for interacting with MongoDB \
database from Python.  The bson package is an implementation of \
the BSON format for Python. The pymongo package is a native Python \
driver for MongoDB. The gridfs package is a gridfs \
implementation on top of pymongo."
LICENSE = "Apache-2.0"

PV = "4.3.3"

RPM_NAME = "python310-pymongo-4.3.3-2.3.aarch64.rpm"
RPM_HASH = "e805cd6fa4079603747f4e8652b3897744d0556b3c2f2d2ba29c6c95f79c11b9dcf608f6d06336b17af7ea6990623b0b08efe85a599f7928c627427f43207541"

RPROVIDES:${PN} += "python3.10dist-pymongo \
python310-pymongo \
python3dist-pymongo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
