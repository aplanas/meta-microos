SUMMARY = "High level compatibility layer for asynchronous event loop implementations"
DESCRIPTION = "Asynchronous compatibility API that allows applications and libraries written \
against it to run unmodified on asyncio, curio and trio."
LICENSE = "MIT"

PV = "3.6.2"

RPM_NAME = "python310-anyio-3.6.2-5.1.noarch.rpm"
RPM_HASH = "df5471ebaf9e78d3d2c3ec0c2ffd3a8125152d87e2a8c6cb4aeec332fdeef6ba47bae897ada50c06fb76b9ef9bfccc3ae946e5a5c84143ffdf3858b923f4c8b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-anyio \
python3.10dist(anyio) \
python310-anyio \
python3dist(anyio)"

RDEPENDS:${PN} += "python(abi) \
python310-idna \
python310-sniffio"

inherit rpm
