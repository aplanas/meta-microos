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

PV = "2.11.2"

RPM_NAME = "postgresql12-timescaledb-2.11.2-1.1.aarch64.rpm"
RPM_HASH = "67f6f1ed7a620dc5d822fcddfcb0ff0525319ff99f044592652329ccf08c15cf7e369f3809ca36971227631d8a412763a8fbc31f2c1c2f8bbcce92576a044a02"

RPROVIDES:${PN} += "postgresql12-timescaledb \
postgresql12-timescaledb-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
postgresql12-server"

inherit rpm
