SUMMARY = "High level compatibility layer for asynchronous event loop implementations"
DESCRIPTION = "Asynchronous compatibility API that allows applications and libraries written \
against it to run unmodified on asyncio, curio and trio."
LICENSE = "MIT"

PV = "3.6.2"

RPM_NAME = "python39-anyio-3.6.2-6.1.noarch.rpm"
RPM_HASH = "908d43960a37c6fa71571e4585d359ced8290638fd95d0a6eaba9172e92b26a4eb0b4f72ac9eb6f482f77d5b956e724725c59e63256a4af8a4e635555aa52ec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-anyio \
python39-anyio \
python3dist-anyio"

RDEPENDS:${PN} += "python-abi \
python39-idna \
python39-sniffio"

inherit rpm
