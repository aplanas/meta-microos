SUMMARY = "Python Object-Document Mapper for working with MongoDB"
DESCRIPTION = "MongoEngine is an ORM-like layer on top of PyMongo. \
MongoEngine is a Python Object-Document Mapper for working with MongoDB \
built on top of PyMongo."
LICENSE = "MIT"

PV = "0.27.0"

RPM_NAME = "python311-mongoengine-0.27.0-1.2.noarch.rpm"
RPM_HASH = "a29a622d0b860da2d20d992a7fd0e188f3ddb2eb907b381181707bb09a62233f8e651f413ed4bcf10ba5b073b6a3a7ea1e32906c0ef9f5d05e8e71d08ab551f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mongoengine) \
python311-mongoengine \
python3dist(mongoengine)"

RDEPENDS:${PN} += "python(abi) \
python311-blinker \
python311-pymongo"

inherit rpm
