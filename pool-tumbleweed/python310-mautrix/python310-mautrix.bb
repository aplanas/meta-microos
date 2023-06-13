SUMMARY = "A Python 3 asyncio Matrix framework"
DESCRIPTION = "A Python 3 asyncio Matrix framework."
LICENSE = "MPL-2.0"

PV = "0.19.15"

RPM_NAME = "python310-mautrix-0.19.15-1.1.noarch.rpm"
RPM_HASH = "95a339fe2eaecba14e7d3d300106038c5722ab0deb871f7afea2886a31e7bb5f72f124f309b4400f35950a81e91d4f9625116a9d9bd09077b669d77e0cb6d5ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mautrix \
python3.10dist(mautrix) \
python310-mautrix \
python3dist(mautrix)"

RDEPENDS:${PN} += "python(abi) \
python310-aiohttp \
python310-attrs \
python310-yarl"

inherit rpm
