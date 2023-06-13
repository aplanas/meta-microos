SUMMARY = "Simple DNS resolver for asyncio"
DESCRIPTION = "Simple DNS resolver for asyncio module."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-aiodns-3.0.0-2.1.noarch.rpm"
RPM_HASH = "23bc1b0b386957bdcd30c9f700ffc27a1ca7582f74f6e263391ed62927a715bd5c5000b2840fecbbd4fe1db03ff0d2465df1c8bc3208329b2217b96b36f5c7b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiodns \
python3.10dist(aiodns) \
python310-aiodns \
python3dist(aiodns)"

RDEPENDS:${PN} += "python(abi) \
python310-pycares"

inherit rpm
