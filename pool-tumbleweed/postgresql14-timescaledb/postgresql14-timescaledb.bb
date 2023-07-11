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

RPM_NAME = "postgresql14-timescaledb-2.10.2-1.4.aarch64.rpm"
RPM_HASH = "e9c60d7a460046f49436d3ad87ca9d4cfedbe8e8f7ea7877dc1cda6a408ce7c0a4583e6519246561948182e68a0d13d0f53640d6418ace8395dc7c9f784e0563"

RPROVIDES:${PN} += "postgresql14-timescaledb \
postgresql14-timescaledb-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
postgresql14-server"

inherit rpm
