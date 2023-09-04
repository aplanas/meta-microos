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

RPM_NAME = "postgresql14-timescaledb-2.11.2-1.1.aarch64.rpm"
RPM_HASH = "60ed25975b28d76eb47dfa43fae4186fc0d114f7429dfa5655ddf625048571238b8aa4385351ea2c94269a22b3ba6804586aab6cc4d88e1511fecffc5e27c4ce"

RPROVIDES:${PN} += "postgresql14-timescaledb \
postgresql14-timescaledb-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
postgresql14-server"

inherit rpm
