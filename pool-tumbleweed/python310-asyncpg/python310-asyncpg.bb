SUMMARY = "Python asyncio PosgtreSQL driver"
DESCRIPTION = "A fast PostgreSQL Database Client Library for Python/asyncio. \
 \
**asyncpg** is a database interface library designed specifically for \
PostgreSQL and Python/asyncio with clean implementation"
LICENSE = "Apache-2.0"

PV = "0.27.0"

RPM_NAME = "python310-asyncpg-0.27.0-1.6.aarch64.rpm"
RPM_HASH = "9fc36dd012c30e2ae2867e13f5a69cff4ac394f2862bf3222ea1a8a0486383f6d1d8e61eb6e944b2c2433388ae63fd4bafd852e8f4b88b4d5f78a9a78395b85d"

RPROVIDES:${PN} += "python3-asyncpg \
python3.10dist(asyncpg) \
python310-asyncpg \
python310-asyncpg(aarch-64) \
python3dist(asyncpg)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpq5 \
python(abi)"

inherit rpm
