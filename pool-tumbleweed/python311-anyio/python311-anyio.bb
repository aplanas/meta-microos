SUMMARY = "High level compatibility layer for asynchronous event loop implementations"
DESCRIPTION = "Asynchronous compatibility API that allows applications and libraries written \
against it to run unmodified on asyncio, curio and trio."
LICENSE = "MIT"

PV = "3.6.2"

RPM_NAME = "python311-anyio-3.6.2-6.1.noarch.rpm"
RPM_HASH = "42e9e02818b364d7e562224e04f53fa46da73d3d25d174d97c12ea4c4f8c3755271481c1f92ad1e09b574a9cab250a2da3dd172d3bf9b292f56fccd802e23275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-anyio \
python3.11dist-anyio \
python311-anyio \
python3dist-anyio"

RDEPENDS:${PN} += "python-abi \
python311-idna \
python311-sniffio"

inherit rpm
