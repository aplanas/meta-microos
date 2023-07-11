SUMMARY = "Simple DNS resolver for asyncio"
DESCRIPTION = "Simple DNS resolver for asyncio module."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-aiodns-3.0.0-2.2.noarch.rpm"
RPM_HASH = "e794088ff44288a96ecb3a0ac6a62b285312a73385715409ac5e485158cff0bfbfc2752b4391b44df583dc5c727e48270de7194a671c1035399071e03bcd77b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aiodns \
python310-aiodns \
python3dist-aiodns"

RDEPENDS:${PN} += "python-abi \
python310-pycares"

inherit rpm
