SUMMARY = "Python pytest plugin for aiohttp support"
DESCRIPTION = "A library that provides fixtures for creation test aiohttp server and client."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "python311-pytest-aiohttp-1.0.4-4.1.noarch.rpm"
RPM_HASH = "190b88685c4ba8454fa6312ffd4929a60535b471f8d4af95fd62edaa0ccecfd63a476482d99cb5bed875dd1c84c6986295abef07bc5924997cfe4f3010ea4b55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-aiohttp \
python3.11dist-pytest-aiohttp \
python311-pytest-aiohttp \
python3dist-pytest-aiohttp"

RDEPENDS:${PN} += "python-abi \
python311-aiohttp \
python311-pytest \
python311-pytest-asyncio"

inherit rpm
