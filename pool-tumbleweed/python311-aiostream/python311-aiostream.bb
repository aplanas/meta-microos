SUMMARY = "Generator-based operators for asynchronous iteration"
DESCRIPTION = "aiostream provides a collection of stream operators that can be \
combined to create asynchronous pipelines of operations."
LICENSE = "Apache-2.0"

PV = "0.4.5"

RPM_NAME = "python311-aiostream-0.4.5-1.3.noarch.rpm"
RPM_HASH = "b5d126655fcdccfc47d75e933d5a8ac2d78d3c8d7acc1b32bb4abd8d9cfa54d7a6cc474cb9fdd05a7e40a49c1588da619e5aed2269714c8d3c2dbd71de8d7d22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-aiostream \
python311-aiostream \
python3dist-aiostream"

RDEPENDS:${PN} += "python-abi \
python311-siosocks"

inherit rpm
