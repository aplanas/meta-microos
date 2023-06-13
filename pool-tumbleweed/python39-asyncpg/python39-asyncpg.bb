SUMMARY = "Python asyncio PosgtreSQL driver"
DESCRIPTION = "A fast PostgreSQL Database Client Library for Python/asyncio. \
 \
**asyncpg** is a database interface library designed specifically for \
PostgreSQL and Python/asyncio with clean implementation"
LICENSE = "Apache-2.0"

PV = "0.27.0"

RPM_NAME = "python39-asyncpg-0.27.0-1.6.aarch64.rpm"
RPM_HASH = "002957db0790b2b8657be131f26e758894debf84b4e4b0d985ae7c46148e6a4633fde5f41954e373bb4f754456791af668b6b14536904d74eee9606d9a264c86"

RPROVIDES:${PN} += "python3.9dist(asyncpg) \
python39-asyncpg \
python39-asyncpg(aarch-64) \
python3dist(asyncpg)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpq5 \
python(abi)"

inherit rpm
