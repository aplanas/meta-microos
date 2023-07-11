SUMMARY = "Simple DNS resolver for asyncio"
DESCRIPTION = "Simple DNS resolver for asyncio module."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-aiodns-3.0.0-2.2.noarch.rpm"
RPM_HASH = "1214ee03ca2711d1a82efb814159ddac790c4a0f244e1ea74705f4acd2360b5f7a2b46b58c3a060eabbbe810f100c999567cfc2d3a6304ee26c14d101d0a458e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiodns \
python3.11dist-aiodns \
python311-aiodns \
python3dist-aiodns"

RDEPENDS:${PN} += "python-abi \
python311-pycares"

inherit rpm
