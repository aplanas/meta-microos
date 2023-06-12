SUMMARY = "Python module for mocking out requests made by ClientSession from aiohttp"
DESCRIPTION = "This is a Python module for mocking out requests made by ClientSession \
from the aiohttp package."
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "python311-aioresponses-0.7.4-1.3.noarch.rpm"
RPM_HASH = "a873b570dd4eba51fdbc2749101c92f419b83aa8e6b05176ddb5947bb9f24d35934f344bf2c2e65026a0005d5cd25ccdf36cdca4fcda488851d728e5d1c08688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aioresponses) \
python311-aioresponses \
python3dist(aioresponses)"
RDEPENDS:${PN} += "python(abi) \
python311-aiohttp"

inherit rpm
