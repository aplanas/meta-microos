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

RPM_NAME = "postgresql15-timescaledb-2.10.2-1.2.aarch64.rpm"
RPM_HASH = "72221c326050384c43f0d2bed0784cacccbe64a52bec00392c6d026ee7388b780eb28069d7a864a5289b434d58b0d3ab11b9f3f7681ff0dca3eed0e94c12aa00"

RPROVIDES:${PN} += "postgresql15-timescaledb \
postgresql15-timescaledb(aarch-64) \
postgresql15-timescaledb-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libssl.so.3()(64bit) \
postgresql15-server"

inherit rpm
