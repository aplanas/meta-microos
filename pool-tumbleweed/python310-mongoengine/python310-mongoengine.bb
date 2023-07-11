SUMMARY = "Python Object-Document Mapper for working with MongoDB"
DESCRIPTION = "MongoEngine is an ORM-like layer on top of PyMongo. \
MongoEngine is a Python Object-Document Mapper for working with MongoDB \
built on top of PyMongo."
LICENSE = "MIT"

PV = "0.27.0"

RPM_NAME = "python310-mongoengine-0.27.0-1.4.noarch.rpm"
RPM_HASH = "8c033efcf8b8e65f8330169b1cde7daa781caf87c9c8360c64be8248b39761c55e4ff20810257ee466f06d3417085cf3740739b5e1bfa00a4d094c405d20704e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mongoengine \
python310-mongoengine \
python3dist-mongoengine"

RDEPENDS:${PN} += "python-abi \
python310-blinker \
python310-pymongo"

inherit rpm
