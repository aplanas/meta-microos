SUMMARY = "Python asyncio PosgtreSQL driver"
DESCRIPTION = "A fast PostgreSQL Database Client Library for Python/asyncio. \
 \
**asyncpg** is a database interface library designed specifically for \
PostgreSQL and Python/asyncio with clean implementation"
LICENSE = "Apache-2.0"

PV = "0.27.0"

RPM_NAME = "python311-asyncpg-0.27.0-2.1.aarch64.rpm"
RPM_HASH = "3002d4a6a744a7fe87d98896632db48bd1485a2c0abfb415163d90781b3db2ae0445f53728fc5c30e27faa2c2ec236ee501ed973c7e34024ea43e509abb3956a"

RPROVIDES:${PN} += "python3-asyncpg \
python3.11dist-asyncpg \
python311-asyncpg \
python3dist-asyncpg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq5 \
python-abi"

inherit rpm
