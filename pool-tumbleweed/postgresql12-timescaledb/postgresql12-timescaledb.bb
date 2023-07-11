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

RPM_NAME = "postgresql12-timescaledb-2.10.2-1.4.aarch64.rpm"
RPM_HASH = "a516abeb597569ee9310ee86737ce5a3e87f7a6ca3f0cfae1a831bfa4fca601824b7d6eef5b1deeaa539bfdc87eefcff2492bc4b0760c49a83a0aa575f5b8d68"

RPROVIDES:${PN} += "postgresql12-timescaledb \
postgresql12-timescaledb-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
postgresql12-server"

inherit rpm
