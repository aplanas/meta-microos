SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.3.0+git0.fac8b9c"

RPM_NAME = "postgresql12-orafce-4.3.0+git0.fac8b9c-1.1.aarch64.rpm"
RPM_HASH = "e9278eeb389eaca5d0461a9c632de17b96eb67fb470fcd393a5029811b803ec9fd669eae21adac8cf8ca50f712ebb9a1669408d70dafc1b69f5dce43fdd8c7cc"

RPROVIDES:${PN} += "orafce \
postgresql12-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql12-server"

inherit rpm
