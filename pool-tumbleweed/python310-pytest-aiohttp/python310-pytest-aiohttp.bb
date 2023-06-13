SUMMARY = "Python pytest plugin for aiohttp support"
DESCRIPTION = "A library that provides fixtures for creation test aiohttp server and client."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "python310-pytest-aiohttp-1.0.4-3.3.noarch.rpm"
RPM_HASH = "3b0c511211c80ecaaeb3a5a9e9cefc5092ffa1b3252c432770519063463e795807d3bc333bce0e731051a6f26c33c923aafb117c6163d4287114fa234ee0f876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-aiohttp \
python3.10dist(pytest-aiohttp) \
python310-pytest-aiohttp \
python3dist(pytest-aiohttp)"

RDEPENDS:${PN} += "python(abi) \
python310-aiohttp \
python310-pytest \
python310-pytest-asyncio"

inherit rpm
