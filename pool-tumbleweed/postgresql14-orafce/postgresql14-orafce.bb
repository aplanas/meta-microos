SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.5.0+git8.b3ad258"

RPM_NAME = "postgresql14-orafce-4.5.0+git8.b3ad258-1.1.aarch64.rpm"
RPM_HASH = "3d8b8ec505621c6fbeca948ee0796de312cfe860c652953cf26e34ba149432d6142a4ccb6e5a066dcc379a96fb48bc149ffd7b531b05caa253179b8f45a04409"

RPROVIDES:${PN} += "orafce \
postgresql14-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql14-server"

inherit rpm
