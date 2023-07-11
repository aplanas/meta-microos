SUMMARY = "Python module for mocking out requests made by ClientSession from aiohttp"
DESCRIPTION = "This is a Python module for mocking out requests made by ClientSession \
from the aiohttp package."
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "python39-aioresponses-0.7.4-1.5.noarch.rpm"
RPM_HASH = "fc35e694454175e8a13bf266f6d33bd8aedcc01863865566ea7ebfd4a1ec650384d663c616ade911d9087e672b9938af48a2e4d20a237be1025f784cfe1d9af2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aioresponses \
python39-aioresponses \
python3dist-aioresponses"

RDEPENDS:${PN} += "python-abi \
python39-aiohttp"

inherit rpm
