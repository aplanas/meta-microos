SUMMARY = "Timeout context manager for asyncio programs"
DESCRIPTION = "This provides an asyncio-compatible timeout context manager."
LICENSE = "Apache-2.0"

PV = "4.0.2"

RPM_NAME = "python310-async_timeout-4.0.2-3.3.noarch.rpm"
RPM_HASH = "b697dd493cbe4904938d2f2b7c73d60a29c23a72fed689c78f7467e4fe34570255fc7bbf17b356ac4a7c462ba7979ecfa6f7e3154041fc0d2ab0fa3aa94d3d06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-async-timeout \
python310-async-timeout \
python3dist-async-timeout"

RDEPENDS:${PN} += "python-abi"

inherit rpm
