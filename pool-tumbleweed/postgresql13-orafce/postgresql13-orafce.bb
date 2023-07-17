SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.4.0+git0.eb5513d"

RPM_NAME = "postgresql13-orafce-4.4.0+git0.eb5513d-1.1.aarch64.rpm"
RPM_HASH = "3f2e5b2c43895aa63e21eaae75be250a6947eabaa5113a494b0b39c881a9f12a7e851ed183a60500a2bb3d9e63ba78c45ce200853a9db812027217d79ad14582"

RPROVIDES:${PN} += "orafce \
postgresql13-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql13-server"

inherit rpm
