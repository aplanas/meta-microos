SUMMARY = "Python asyncio PosgtreSQL driver"
DESCRIPTION = "A fast PostgreSQL Database Client Library for Python/asyncio. \
 \
**asyncpg** is a database interface library designed specifically for \
PostgreSQL and Python/asyncio with clean implementation"
LICENSE = "Apache-2.0"

PV = "0.28.0"

RPM_NAME = "python39-asyncpg-0.28.0-1.1.aarch64.rpm"
RPM_HASH = "4406a18c239de882224f7a35f2f9b2889a5dc580411574ad33f1f6c227de8c25589672f4aebde13034fc5de0a363235c3442136eb05d62ed73ad47fe0c5fe1e2"

RPROVIDES:${PN} += "python3.9dist-asyncpg \
python39-asyncpg \
python3dist-asyncpg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq5 \
python-abi"

inherit rpm
