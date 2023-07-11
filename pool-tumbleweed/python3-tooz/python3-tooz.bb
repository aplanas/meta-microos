SUMMARY = "Coordination library for distributed systems"
DESCRIPTION = "The Tooz project aims at centralizing the most common distributed primitives \
like group membership protocol, lock service and leader election by providing \
a coordination API helping developers to build distributed applications. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "2.11.1"

RPM_NAME = "python3-tooz-2.11.1-2.5.noarch.rpm"
RPM_HASH = "c03904a0f67ed575bd5569eb7d90e6310d64c8b7d136e59214e7847c68684df17524f68417de70b2df2bd8bcf63acc7d1ee573a74eef5b9a9e2744c7b0a1cdca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tooz \
python3.11dist-tooz \
python3dist-tooz"

RDEPENDS:${PN} += "python-abi \
python3-fasteners \
python3-futurist \
python3-msgpack \
python3-oslo.serialization \
python3-oslo.utils \
python3-stevedore \
python3-tenacity \
python3-voluptuous"

inherit rpm
