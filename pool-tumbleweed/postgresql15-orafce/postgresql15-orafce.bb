SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.5.0+git8.b3ad258"

RPM_NAME = "postgresql15-orafce-4.5.0+git8.b3ad258-1.2.aarch64.rpm"
RPM_HASH = "230b1ce79cfe25bcfc2f2ad103b47c87133a6c1883e1ab62a94d4bc267861dfd9d4de757adcdd9bf8cb03d40d5c6dc2608fca186355cbc13770903b359cb7464"

RPROVIDES:${PN} += "orafce \
postgresql15-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql15-server"

inherit rpm
