SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.5.0+git8.b3ad258"

RPM_NAME = "postgresql13-orafce-4.5.0+git8.b3ad258-1.2.aarch64.rpm"
RPM_HASH = "59139ce46f82c44f3274eeb4b09769ff6237eaeff974c1490e7f365585c0073cdb68e248151f9be42ffe853d85c06d670de1455eb3acf154e72557f63b2d678f"

RPROVIDES:${PN} += "orafce \
postgresql13-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql13-server"

inherit rpm
