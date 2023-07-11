SUMMARY = "Python pytest plugin for aiohttp support"
DESCRIPTION = "A library that provides fixtures for creation test aiohttp server and client."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "python310-pytest-aiohttp-1.0.4-4.1.noarch.rpm"
RPM_HASH = "66e599b1c40e59d6de41c290e059b76bd006d3e3e5829c7ef566970d8d57e4789f4e68445498243c473092f1f5f51be761aa37088aac8e46932e34fe262fc876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-aiohttp \
python310-pytest-aiohttp \
python3dist-pytest-aiohttp"

RDEPENDS:${PN} += "python-abi \
python310-aiohttp \
python310-pytest \
python310-pytest-asyncio"

inherit rpm
