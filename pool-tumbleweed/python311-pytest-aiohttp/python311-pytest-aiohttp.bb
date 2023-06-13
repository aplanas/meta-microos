SUMMARY = "Python pytest plugin for aiohttp support"
DESCRIPTION = "A library that provides fixtures for creation test aiohttp server and client."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "python311-pytest-aiohttp-1.0.4-3.3.noarch.rpm"
RPM_HASH = "526ce16459536df95b16a261185bbb8f33113425bb5802d471abb74a13312c0b50a2d83fd9c67c59482554ab5804eaf9deb93696a986e860e742a8a0b1936530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-aiohttp) \
python311-pytest-aiohttp \
python3dist(pytest-aiohttp)"

RDEPENDS:${PN} += "python(abi) \
python311-aiohttp \
python311-pytest \
python311-pytest-asyncio"

inherit rpm
