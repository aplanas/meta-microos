SUMMARY = "File support for asyncio"
DESCRIPTION = "aiofiles: file support for asyncio"
LICENSE = "Apache-2.0"

PV = "23.1.0"

RPM_NAME = "python311-aiofiles-23.1.0-1.2.noarch.rpm"
RPM_HASH = "6c5a6b4474b6031426a93bb5450248f5033dfab36268f437335676003fdb2248b96c4379106d4bc40189b2f31474bdaf6647eee5fc8feb36f4b588f2488e318b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aiofiles) \
python311-aiofiles \
python3dist(aiofiles)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
