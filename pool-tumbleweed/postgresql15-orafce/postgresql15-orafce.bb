SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.4.0+git0.eb5513d"

RPM_NAME = "postgresql15-orafce-4.4.0+git0.eb5513d-1.1.aarch64.rpm"
RPM_HASH = "a20aeb39965625261787eafc1b41720cff356083748e9323557b363f275c870b702b61be73b9caf567be65e7bdab1048b4b0b50ee4bfa7180d993111655bba2c"

RPROVIDES:${PN} += "orafce \
postgresql15-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql15-server"

inherit rpm
