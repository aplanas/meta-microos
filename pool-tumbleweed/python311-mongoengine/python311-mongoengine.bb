SUMMARY = "Python Object-Document Mapper for working with MongoDB"
DESCRIPTION = "MongoEngine is an ORM-like layer on top of PyMongo. \
MongoEngine is a Python Object-Document Mapper for working with MongoDB \
built on top of PyMongo."
LICENSE = "MIT"

PV = "0.27.0"

RPM_NAME = "python311-mongoengine-0.27.0-1.4.noarch.rpm"
RPM_HASH = "1de81800837439c82b1b6098d66c9df24a1ccb9b52643184bdc8fe7caeffd83673a307ce1684d3a74ab19cad88845e88c24bbf4088a61d4a7b17ebdbec5f5597"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mongoengine \
python3.11dist-mongoengine \
python311-mongoengine \
python3dist-mongoengine"

RDEPENDS:${PN} += "python-abi \
python311-blinker \
python311-pymongo"

inherit rpm
