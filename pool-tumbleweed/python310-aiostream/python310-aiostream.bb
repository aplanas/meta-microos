SUMMARY = "Generator-based operators for asynchronous iteration"
DESCRIPTION = "aiostream provides a collection of stream operators that can be \
combined to create asynchronous pipelines of operations."
LICENSE = "Apache-2.0"

PV = "0.4.5"

RPM_NAME = "python310-aiostream-0.4.5-1.3.noarch.rpm"
RPM_HASH = "b57ed809a9b721eecd5c9846166b8da3950496b722eb87e93433d2838e0f105eacc6eb6d37ac9da3cf452c8bf1aa7c20eaa658e590ab9d9785fc515cdc4c1280"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiostream \
python3.10dist(aiostream) \
python310-aiostream \
python3dist(aiostream)"
RDEPENDS:${PN} += "python(abi) \
python310-siosocks"

inherit rpm
