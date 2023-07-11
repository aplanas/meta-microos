SUMMARY = "A Python 3 asyncio Matrix framework"
DESCRIPTION = "A Python 3 asyncio Matrix framework."
LICENSE = "MPL-2.0"

PV = "0.19.15"

RPM_NAME = "python311-mautrix-0.19.15-1.4.noarch.rpm"
RPM_HASH = "310d9d3e44a464625e4b59dffa3633e15d264295d1bb730467d1bda59306033118f83bdcc14c667ce1f89e2bdc5cd40412f6ec9feb08cc219cb6210a0c8cb1ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mautrix \
python3.11dist-mautrix \
python311-mautrix \
python3dist-mautrix"

RDEPENDS:${PN} += "python-abi \
python311-aiohttp \
python311-attrs \
python311-yarl"

inherit rpm
