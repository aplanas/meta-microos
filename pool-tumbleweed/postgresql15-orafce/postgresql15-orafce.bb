SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.3.0+git0.fac8b9c"

RPM_NAME = "postgresql15-orafce-4.3.0+git0.fac8b9c-1.1.aarch64.rpm"
RPM_HASH = "8573c9e74e8f0e18fa20822b5074d0efa8b7163c5396f08bc4be3b514b30a79097b64735d3547000ab931efae33f3515a15aa2ba83d9fae911699cd9c7bf19cb"

RPROVIDES:${PN} += "orafce \
postgresql15-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql15-server"

inherit rpm
