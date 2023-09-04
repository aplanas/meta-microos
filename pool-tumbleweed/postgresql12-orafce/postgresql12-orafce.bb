SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.5.0+git8.b3ad258"

RPM_NAME = "postgresql12-orafce-4.5.0+git8.b3ad258-1.2.aarch64.rpm"
RPM_HASH = "8864c71487bf24eb5fbb6af38ab0b51c407b5aeb934338897d3eecdc97505182e0ac180433edb57c25c5b1bb3344ad0c86ab1cc976cc5d5b951e87a92cee19d1"

RPROVIDES:${PN} += "orafce \
postgresql12-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql12-server"

inherit rpm
