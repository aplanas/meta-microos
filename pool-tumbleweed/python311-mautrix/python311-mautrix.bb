SUMMARY = "A Python 3 asyncio Matrix framework"
DESCRIPTION = "A Python 3 asyncio Matrix framework."
LICENSE = "MPL-2.0"

PV = "0.19.15"

RPM_NAME = "python311-mautrix-0.19.15-1.1.noarch.rpm"
RPM_HASH = "061efc809f9c9edc1d83428519333f85f256350934acaa7f05173aed08cebe5a3901ce145c21e9a5138921b23f296968142b3fb9c780d901f333db2ff2cee179"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-mautrix \
python311-mautrix \
python3dist-mautrix"

RDEPENDS:${PN} += "python-abi \
python311-aiohttp \
python311-attrs \
python311-yarl"

inherit rpm
