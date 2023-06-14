SUMMARY = "A time-series database extension for PostgreSQL"
DESCRIPTION = "TimescaleDB is a database for making SQL more scalable for \
time-series data. It is engineered up from PostgreSQL, providing \
automatic partitioning across time and space (partitioning key), as \
well as full SQL support. \
 \
TimescaleDB is packaged as a PostgreSQL extension. \
 \
This build includes only Apache2 modules; \
TSL (timescale licenced modules are not built)."
LICENSE = "Apache-2.0"

PV = "2.10.2"

RPM_NAME = "postgresql12-timescaledb-2.10.2-1.2.aarch64.rpm"
RPM_HASH = "787e1467bc28e68055a5c627a12f9d23c2f78efaa5705eee0c3edc8aae54ebce3e7c8d8de3bcc28811f2db1ca0c2369d73b9891bb58458ee86e2d1cbed522d5b"

RPROVIDES:${PN} += "postgresql12-timescaledb \
postgresql12-timescaledb-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
postgresql12-server"

inherit rpm
