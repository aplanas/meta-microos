SUMMARY = "Python pytest plugin for aiohttp support"
DESCRIPTION = "A library that provides fixtures for creation test aiohttp server and client."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "python39-pytest-aiohttp-1.0.4-4.1.noarch.rpm"
RPM_HASH = "a6df8c65a6e6f33d7d8a1e018582778c89e17311978f19c7cd39ae140aa76977f39e0432bb327b4306ecfbaf74b66eeaa82edf340f6f4742bb4943ccc4d91a72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-aiohttp \
python39-pytest-aiohttp \
python3dist-pytest-aiohttp"

RDEPENDS:${PN} += "python-abi \
python39-aiohttp \
python39-pytest \
python39-pytest-asyncio"

inherit rpm
