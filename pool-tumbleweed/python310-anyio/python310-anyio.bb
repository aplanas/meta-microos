SUMMARY = "High level compatibility layer for asynchronous event loop implementations"
DESCRIPTION = "Asynchronous compatibility API that allows applications and libraries written \
against it to run unmodified on asyncio, curio and trio."
LICENSE = "MIT"

PV = "3.6.2"

RPM_NAME = "python310-anyio-3.6.2-5.3.noarch.rpm"
RPM_HASH = "42789a87de8eb2d1890f2cb69a9a9393f57e1f0f9818818f6720a0baa8158fe29aa37d5b1b6b089a7aa16bdbabef4dc5f97f5212530eb06756de45b7092c840e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-anyio \
python310-anyio \
python3dist-anyio"

RDEPENDS:${PN} += "python-abi \
python310-idna \
python310-sniffio"

inherit rpm
