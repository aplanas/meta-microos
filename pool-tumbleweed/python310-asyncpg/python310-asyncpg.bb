SUMMARY = "Python asyncio PosgtreSQL driver"
DESCRIPTION = "A fast PostgreSQL Database Client Library for Python/asyncio. \
 \
**asyncpg** is a database interface library designed specifically for \
PostgreSQL and Python/asyncio with clean implementation"
LICENSE = "Apache-2.0"

PV = "0.28.0"

RPM_NAME = "python310-asyncpg-0.28.0-1.1.aarch64.rpm"
RPM_HASH = "0727090ab8a7a68ece0393ed50dea03636740dccd741e8b33dfe605dd7c3763b016552061b0f76422f0579713ec6c00a4c273f936377b7a16349a96e21637ed2"

RPROVIDES:${PN} += "python3.10dist-asyncpg \
python310-asyncpg \
python3dist-asyncpg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq5 \
python-abi"

inherit rpm
