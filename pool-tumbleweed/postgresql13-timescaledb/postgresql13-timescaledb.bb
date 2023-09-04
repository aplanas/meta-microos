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

RPM_NAME = "postgresql13-timescaledb-2.11.2-1.1.aarch64.rpm"
RPM_HASH = "91b526c60214ea44491bac9420c2d1c7f003cda00ef6925e35d9423ea2332f7af32d8f514185c82c7b7dc7a7b679df280b2257e6857b7ca4620c8ff6d3590e00"

RPROVIDES:${PN} += "postgresql13-timescaledb \
postgresql13-timescaledb-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
postgresql13-server"

inherit rpm
