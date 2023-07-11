SUMMARY = "Simple DNS resolver for asyncio"
DESCRIPTION = "Simple DNS resolver for asyncio module."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-aiodns-3.0.0-2.2.noarch.rpm"
RPM_HASH = "3d3d05ad6d2e43939c2ba0cfeeec3cc97a1dc1125e1f3a26acf721fb3a87a0ccc4f8eba97a4ca699f082e9a6f9fe6ebe8569502e17ecb27f3ea01f82ef061251"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aiodns \
python39-aiodns \
python3dist-aiodns"

RDEPENDS:${PN} += "python-abi \
python39-pycares"

inherit rpm
