SUMMARY = "Python module for mocking out requests made by ClientSession from aiohttp"
DESCRIPTION = "This is a Python module for mocking out requests made by ClientSession \
from the aiohttp package."
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "python310-aioresponses-0.7.4-1.5.noarch.rpm"
RPM_HASH = "bbf885ee8161e5d75374cd53e247c22de5fc826b1f07f43504ace532f70daf59f0dccb562eefcef5bb7f5eb7f3198d22564dc3fbef831e98364151d4905012f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aioresponses \
python310-aioresponses \
python3dist-aioresponses"

RDEPENDS:${PN} += "python-abi \
python310-aiohttp"

inherit rpm
