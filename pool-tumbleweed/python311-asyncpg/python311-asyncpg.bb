SUMMARY = "Python asyncio PosgtreSQL driver"
DESCRIPTION = "A fast PostgreSQL Database Client Library for Python/asyncio. \
 \
**asyncpg** is a database interface library designed specifically for \
PostgreSQL and Python/asyncio with clean implementation"
LICENSE = "Apache-2.0"

PV = "0.28.0"

RPM_NAME = "python311-asyncpg-0.28.0-1.1.aarch64.rpm"
RPM_HASH = "4119fd3d41f5082642597c21ed52940d166149047bcceab5290992444572f4e23ed2e0f8cc787534b99183754a61a582f72e081a77d91269014923ed7b34e11a"

RPROVIDES:${PN} += "python3-asyncpg \
python3.11dist-asyncpg \
python311-asyncpg \
python3dist-asyncpg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq5 \
python-abi"

inherit rpm
