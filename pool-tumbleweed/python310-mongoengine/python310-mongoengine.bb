SUMMARY = "Python Object-Document Mapper for working with MongoDB"
DESCRIPTION = "MongoEngine is an ORM-like layer on top of PyMongo. \
MongoEngine is a Python Object-Document Mapper for working with MongoDB \
built on top of PyMongo."
LICENSE = "MIT"

PV = "0.27.0"

RPM_NAME = "python310-mongoengine-0.27.0-1.2.noarch.rpm"
RPM_HASH = "3f2980bc017669af055f74c8bcdcee8f0acf5dc172ad5ee499f6de8374fd38e1a1e392e359b79e74001e16a03ad714e2e628556a3f754f55ab2b30da760f606a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mongoengine \
python3.10dist-mongoengine \
python310-mongoengine \
python3dist-mongoengine"

RDEPENDS:${PN} += "python-abi \
python310-blinker \
python310-pymongo"

inherit rpm
