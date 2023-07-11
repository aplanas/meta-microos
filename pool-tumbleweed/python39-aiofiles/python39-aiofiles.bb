SUMMARY = "File support for asyncio"
DESCRIPTION = "aiofiles: file support for asyncio"
LICENSE = "Apache-2.0"

PV = "23.1.0"

RPM_NAME = "python39-aiofiles-23.1.0-2.3.noarch.rpm"
RPM_HASH = "8e4c0e37e599765acafa20dcaab235c5aae12846c5c0a6f2d9b0735fae068d4f8d87723ae88177a6f73c564dccd20d58fff44fb276fc7225aed3f98224481f45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aiofiles \
python39-aiofiles \
python3dist-aiofiles"

RDEPENDS:${PN} += "python-abi"

inherit rpm
