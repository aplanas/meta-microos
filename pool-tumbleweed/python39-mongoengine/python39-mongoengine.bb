SUMMARY = "Python Object-Document Mapper for working with MongoDB"
DESCRIPTION = "MongoEngine is an ORM-like layer on top of PyMongo. \
MongoEngine is a Python Object-Document Mapper for working with MongoDB \
built on top of PyMongo."
LICENSE = "MIT"

PV = "0.27.0"

RPM_NAME = "python39-mongoengine-0.27.0-1.2.noarch.rpm"
RPM_HASH = "9a007cf3f084ac1e3ea10b2b0cb28aecfa65ccd810e4d325953ce1beec4cd475002c73885601d166043c87482db55e82692090b4eedf7b7f3c58730ba94329bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mongoengine) \
python39-mongoengine \
python3dist(mongoengine)"
RDEPENDS:${PN} += "python(abi) \
python39-blinker \
python39-pymongo"

inherit rpm
