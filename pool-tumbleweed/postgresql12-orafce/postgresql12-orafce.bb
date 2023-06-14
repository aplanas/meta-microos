SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.2.6+git0.86d7f4c"

RPM_NAME = "postgresql12-orafce-4.2.6+git0.86d7f4c-1.2.aarch64.rpm"
RPM_HASH = "aeac94a5916c26d1c880fdc7c74c27f083c507ddced1b08cab44c9cdfa91ce1d5f0388ae53481a0ba2c1d598c80ceb264ba383ca1df652c73b3537763cc1c24a"

RPROVIDES:${PN} += "orafce \
postgresql12-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql12-server"

inherit rpm
