SUMMARY = "Python module for mocking out requests made by ClientSession from aiohttp"
DESCRIPTION = "This is a Python module for mocking out requests made by ClientSession \
from the aiohttp package."
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "python39-aioresponses-0.7.4-1.3.noarch.rpm"
RPM_HASH = "b7001537a57d143497d6f7a8ab9549b23619ed6b8d9fd865d0720af43d4ad8936c9ac8529d4a7c0dc6519e7e4733e267487a96e9d871260fd3f43c8a3e68dbf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aioresponses) \
python39-aioresponses \
python3dist(aioresponses)"
RDEPENDS:${PN} += "python(abi) \
python39-aiohttp"

inherit rpm
