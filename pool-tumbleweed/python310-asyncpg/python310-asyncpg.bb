SUMMARY = "Python asyncio PosgtreSQL driver"
DESCRIPTION = "A fast PostgreSQL Database Client Library for Python/asyncio. \
 \
**asyncpg** is a database interface library designed specifically for \
PostgreSQL and Python/asyncio with clean implementation"
LICENSE = "Apache-2.0"

PV = "0.27.0"

RPM_NAME = "python310-asyncpg-0.27.0-2.1.aarch64.rpm"
RPM_HASH = "ac1fa74cf375bfef1b180821e6a42c8911f9b64088a4b4a3b65b832b630a446b80310050dde376a8a7238c65be9035938cd4063b1342a2104bf70ea5241a5f7c"

RPROVIDES:${PN} += "python3.10dist-asyncpg \
python310-asyncpg \
python3dist-asyncpg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq5 \
python-abi"

inherit rpm
