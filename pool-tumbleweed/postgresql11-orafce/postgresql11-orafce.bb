SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.4.0+git0.eb5513d"

RPM_NAME = "postgresql11-orafce-4.4.0+git0.eb5513d-1.1.aarch64.rpm"
RPM_HASH = "a19d9f49898bc8ea4419a172835f43a07981f0c9674102d9be138f4bfd79ca234c2fc0c9e11a77a1aec4871d9bbd5be7fd57ab2f9ddb1105eebc565997e27f01"

RPROVIDES:${PN} += "orafce \
postgresql11-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql11-server"

inherit rpm
