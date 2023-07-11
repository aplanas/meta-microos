SUMMARY = "High level compatibility layer for asynchronous event loop implementations"
DESCRIPTION = "Asynchronous compatibility API that allows applications and libraries written \
against it to run unmodified on asyncio, curio and trio."
LICENSE = "MIT"

PV = "3.6.2"

RPM_NAME = "python39-anyio-3.6.2-5.3.noarch.rpm"
RPM_HASH = "29e311650e239361b3032d7535be7e7a013d2e6c8ca49d1de812c9a5988e5c9e21e917636f8521474bac769a417f35b8c484fd7b7f47b280aba67886ea7bdb63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-anyio \
python39-anyio \
python3dist-anyio"

RDEPENDS:${PN} += "python-abi \
python39-idna \
python39-sniffio"

inherit rpm
