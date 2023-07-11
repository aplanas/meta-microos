SUMMARY = "File support for asyncio"
DESCRIPTION = "aiofiles: file support for asyncio"
LICENSE = "Apache-2.0"

PV = "23.1.0"

RPM_NAME = "python311-aiofiles-23.1.0-2.3.noarch.rpm"
RPM_HASH = "624b058d7713dfabf16b92915d287b52d5bb670271be9a964854bd38dae2b0677cf166bb8eb9b70355128dd86d5747ff37fc58aa6abae0f78f7586bbd2cb870b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiofiles \
python3.11dist-aiofiles \
python311-aiofiles \
python3dist-aiofiles"

RDEPENDS:${PN} += "python-abi"

inherit rpm
