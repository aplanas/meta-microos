SUMMARY = "Timeout context manager for asyncio programs"
DESCRIPTION = "This provides an asyncio-compatible timeout context manager."
LICENSE = "Apache-2.0"

PV = "4.0.3"

RPM_NAME = "python310-async_timeout-4.0.3-1.1.noarch.rpm"
RPM_HASH = "f13dc8675261412972393304752ca4b410361189276ec4f1bacfda04261a7fd7e1327d01c207d619ab775e69d0c5d2dcc66fe54967b256394a68f917c3047ba9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-async-timeout \
python310-async-timeout \
python3dist-async-timeout"

RDEPENDS:${PN} += "python-abi"

inherit rpm
