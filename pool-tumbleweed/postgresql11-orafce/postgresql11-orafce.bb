SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.3.0+git0.fac8b9c"

RPM_NAME = "postgresql11-orafce-4.3.0+git0.fac8b9c-1.1.aarch64.rpm"
RPM_HASH = "24d60b281422a7921e56f3238d53f4bf3637957b6e4b1f51063004c331dc12c5f244b926520fa743b903fd129de44fc15cc2318dbf8c1ca3b6c2822036535c82"

RPROVIDES:${PN} += "orafce \
postgresql11-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql11-server"

inherit rpm
