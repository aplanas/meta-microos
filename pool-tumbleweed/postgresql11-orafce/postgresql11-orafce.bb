SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.6.0+git0.6020b1e"

RPM_NAME = "postgresql11-orafce-4.6.0+git0.6020b1e-1.1.aarch64.rpm"
RPM_HASH = "79e23caaa5553cf51ff60d4365429c9cf7dc5291921fecea4db7e52c2c0f1216d738ee64f22b19500002d49c751e63f8e137f46318faef82eb005aeacd851f04"

RPROVIDES:${PN} += "orafce \
postgresql11-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql11-server"

inherit rpm
