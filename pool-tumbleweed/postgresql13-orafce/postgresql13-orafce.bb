SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.6.0+git0.6020b1e"

RPM_NAME = "postgresql13-orafce-4.6.0+git0.6020b1e-1.1.aarch64.rpm"
RPM_HASH = "641b48fc3dd1bc12eaa909a3f03711c1d12e5180b44d27360153034f5ebf655bc53f84104963a0d129dda24d0f818e762b33c3918c57f52f1c213f0dfbdd3660"

RPROVIDES:${PN} += "orafce \
postgresql13-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql13-server"

inherit rpm
