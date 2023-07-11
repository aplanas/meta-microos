SUMMARY = "Python asyncio PosgtreSQL driver"
DESCRIPTION = "A fast PostgreSQL Database Client Library for Python/asyncio. \
 \
**asyncpg** is a database interface library designed specifically for \
PostgreSQL and Python/asyncio with clean implementation"
LICENSE = "Apache-2.0"

PV = "0.27.0"

RPM_NAME = "python39-asyncpg-0.27.0-2.1.aarch64.rpm"
RPM_HASH = "a4ba6dc36f138075326b4a74b2185761a479442c8d33894d7d07753899d95e63843e2adbe9aecd1309d1b985a20c157172ba41bf1ab39c14a2d3753c90937104"

RPROVIDES:${PN} += "python3.9dist-asyncpg \
python39-asyncpg \
python3dist-asyncpg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq5 \
python-abi"

inherit rpm
