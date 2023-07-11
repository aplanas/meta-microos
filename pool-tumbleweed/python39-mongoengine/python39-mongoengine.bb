SUMMARY = "Python Object-Document Mapper for working with MongoDB"
DESCRIPTION = "MongoEngine is an ORM-like layer on top of PyMongo. \
MongoEngine is a Python Object-Document Mapper for working with MongoDB \
built on top of PyMongo."
LICENSE = "MIT"

PV = "0.27.0"

RPM_NAME = "python39-mongoengine-0.27.0-1.4.noarch.rpm"
RPM_HASH = "1fc676a407539136da545066cb2ebe7ad2e3102f2dd101cf60f0996250dfddedf687cf152fcf1652f132e16a0bae79baac1926605239725cd94214b48ab1b3b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mongoengine \
python39-mongoengine \
python3dist-mongoengine"

RDEPENDS:${PN} += "python-abi \
python39-blinker \
python39-pymongo"

inherit rpm
