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

RPM_NAME = "postgresql13-timescaledb-2.10.2-1.4.aarch64.rpm"
RPM_HASH = "5a4f8354ebe912fd8f134246783eecbdcf60c8bf0ca56bbe907e382f7a63b7cac31943c76a5bf1723c15d5722e2663279623e2c6b1004101ae187c5cc706245c"

RPROVIDES:${PN} += "postgresql13-timescaledb \
postgresql13-timescaledb-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
postgresql13-server"

inherit rpm
