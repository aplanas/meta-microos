SUMMARY = "File support for asyncio"
DESCRIPTION = "aiofiles: file support for asyncio"
LICENSE = "Apache-2.0"

PV = "23.1.0"

RPM_NAME = "python310-aiofiles-23.1.0-2.3.noarch.rpm"
RPM_HASH = "39dcfe3845ef7568306bb623ba84213cd27aa67eea4a530bde9ad5853eb2edf742fe45ca27a77085182eab15623d657be04e2fd1c88a394b7b82428cba1bf4ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aiofiles \
python310-aiofiles \
python3dist-aiofiles"

RDEPENDS:${PN} += "python-abi"

inherit rpm
