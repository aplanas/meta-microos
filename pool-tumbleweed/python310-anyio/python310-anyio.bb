SUMMARY = "High level compatibility layer for asynchronous event loop implementations"
DESCRIPTION = "Asynchronous compatibility API that allows applications and libraries written \
against it to run unmodified on asyncio, curio and trio."
LICENSE = "MIT"

PV = "3.6.2"

RPM_NAME = "python310-anyio-3.6.2-6.1.noarch.rpm"
RPM_HASH = "59dc202d06a43dc3649fd408d0d3d1c3b8afaf02657c3a00fcebcea8c9b760271ee12431285a517e606a677b7566310d54b8117568c011376140d718f277283f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-anyio \
python310-anyio \
python3dist-anyio"

RDEPENDS:${PN} += "python-abi \
python310-idna \
python310-sniffio"

inherit rpm
