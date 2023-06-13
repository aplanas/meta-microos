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

RPM_NAME = "postgresql13-timescaledb-2.10.2-1.2.aarch64.rpm"
RPM_HASH = "82027230fbd5fef5726aa98c4735048699ef5f7218694d3c0fc8db1e983b7e647d40f3b5ff07bddd8bd2fa8bfdbfd25a09b0e1b836320932bbf98640fd28dcab"

RPROVIDES:${PN} += "postgresql13-timescaledb \
postgresql13-timescaledb(aarch-64) \
postgresql13-timescaledb-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libssl.so.3()(64bit) \
postgresql13-server"

inherit rpm
