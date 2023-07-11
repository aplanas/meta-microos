SUMMARY = "Python module for mocking out requests made by ClientSession from aiohttp"
DESCRIPTION = "This is a Python module for mocking out requests made by ClientSession \
from the aiohttp package."
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "python311-aioresponses-0.7.4-1.5.noarch.rpm"
RPM_HASH = "f8cdd96e7c3a838bc1c17bce099c517debe5244753259ffa77014553d1fdc96382d1c4cd1062ac3e4c12ae89176e15e67a91a290caf60f0c6954527656441b76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aioresponses \
python3.11dist-aioresponses \
python311-aioresponses \
python3dist-aioresponses"

RDEPENDS:${PN} += "python-abi \
python311-aiohttp"

inherit rpm
