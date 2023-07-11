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

RPM_NAME = "postgresql15-timescaledb-2.10.2-1.4.aarch64.rpm"
RPM_HASH = "5ce735b9336617e09ed276024a142b0a02c9c43bc53510ef4854ba042cb19863deb7f1b1b9925aa8b3ccc0c870dd75b449277dd3581076c8c1c66b0c9e094e71"

RPROVIDES:${PN} += "postgresql15-timescaledb \
postgresql15-timescaledb-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
postgresql15-server"

inherit rpm
