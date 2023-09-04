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

RPM_NAME = "postgresql15-timescaledb-2.11.2-1.1.aarch64.rpm"
RPM_HASH = "e81030fec6be6224e0c44dbed8714dfd7e4efd9b12aa70486734181db864c28c016f3ba379f196d3a152e3d992220e16be3aae1613e3292227cda480f6f8b4ff"

RPROVIDES:${PN} += "postgresql15-timescaledb \
postgresql15-timescaledb-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
postgresql15-server"

inherit rpm
