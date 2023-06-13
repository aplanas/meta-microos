SUMMARY = "File support for asyncio"
DESCRIPTION = "aiofiles: file support for asyncio"
LICENSE = "Apache-2.0"

PV = "23.1.0"

RPM_NAME = "python39-aiofiles-23.1.0-1.2.noarch.rpm"
RPM_HASH = "ffaa10108aa00dc77064c9db6502ed3e3a4c4f48ee3f0c156d28ca4104d1295db7749b7307948bef0077a6d7f5e92a0fad3e9ece516372a5b38c6a43cd500f62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aiofiles) \
python39-aiofiles \
python3dist(aiofiles)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
