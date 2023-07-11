SUMMARY = "High level compatibility layer for asynchronous event loop implementations"
DESCRIPTION = "Asynchronous compatibility API that allows applications and libraries written \
against it to run unmodified on asyncio, curio and trio."
LICENSE = "MIT"

PV = "3.6.2"

RPM_NAME = "python311-anyio-3.6.2-5.3.noarch.rpm"
RPM_HASH = "c4cb226c3059cb4e9aa35b46eb64ca74b74fba452fe3796f0bb4a8c05e7aa8730b612d7645304c9a68a4a90137273fb7134c757777daedba5f9a4aed8895ff7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-anyio \
python3.11dist-anyio \
python311-anyio \
python3dist-anyio"

RDEPENDS:${PN} += "python-abi \
python311-idna \
python311-sniffio"

inherit rpm
