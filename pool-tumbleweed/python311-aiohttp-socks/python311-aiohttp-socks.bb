SUMMARY = "SOCKS proxy connector for aiohttp"
DESCRIPTION = "SOCKS proxy connector for aiohttp"
LICENSE = "Apache-2.0"

PV = "0.8.0"

RPM_NAME = "python311-aiohttp-socks-0.8.0-2.1.noarch.rpm"
RPM_HASH = "11ffa0f5d903743e3bd5f99e618b62623e7eac29f9417a4858d615f4a8fe2222af2ad00e48ee3965d609cffefabb93ea283787d54b772da6fc31893c244ed0f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiohttp-socks \
python3.11dist-aiohttp-socks \
python311-aiohttp-socks \
python3dist-aiohttp-socks"

RDEPENDS:${PN} += "python-abi \
python311-aiohttp \
python311-attrs \
python311-python-socks"

inherit rpm
