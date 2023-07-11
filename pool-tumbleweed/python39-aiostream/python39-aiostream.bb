SUMMARY = "Generator-based operators for asynchronous iteration"
DESCRIPTION = "aiostream provides a collection of stream operators that can be \
combined to create asynchronous pipelines of operations."
LICENSE = "Apache-2.0"

PV = "0.4.5"

RPM_NAME = "python39-aiostream-0.4.5-1.5.noarch.rpm"
RPM_HASH = "824d589909e2a3293c441dd78a9a9e2629bb2c9eb625293ad5645a4755312ac2b57389fb8d2bc86329018c8c2fbb2a45b1222aabb566c9faf7c58b7425419ef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aiostream \
python39-aiostream \
python3dist-aiostream"

RDEPENDS:${PN} += "python-abi \
python39-siosocks"

inherit rpm
