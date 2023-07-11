SUMMARY = "Python driver for MongoDB"
DESCRIPTION = "The PyMongo distribution contains tools for interacting with MongoDB \
database from Python.  The bson package is an implementation of \
the BSON format for Python. The pymongo package is a native Python \
driver for MongoDB. The gridfs package is a gridfs \
implementation on top of pymongo."
LICENSE = "Apache-2.0"

PV = "4.3.3"

RPM_NAME = "python39-pymongo-4.3.3-2.3.aarch64.rpm"
RPM_HASH = "c773333b2a4433bd746a8f5ce8885c003fe9df4f54e5cb8b515ee381e6247ac908442334d76f3c35db85d3d2f697e8e8cf213767fd7f634456a809977867d2d5"

RPROVIDES:${PN} += "python3.9dist-pymongo \
python39-pymongo \
python3dist-pymongo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
