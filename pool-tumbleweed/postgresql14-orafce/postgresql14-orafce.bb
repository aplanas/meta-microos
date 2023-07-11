SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.3.0+git0.fac8b9c"

RPM_NAME = "postgresql14-orafce-4.3.0+git0.fac8b9c-1.1.aarch64.rpm"
RPM_HASH = "f3b6df57ca81bc8bb5169c044f3206e77dad87e86b7c177c60d8a9ede38a565211c8dd98a93ed4c9f88a55a459d8625c0bccb8c035a2a18561a36e0b29291dfc"

RPROVIDES:${PN} += "orafce \
postgresql14-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql14-server"

inherit rpm
