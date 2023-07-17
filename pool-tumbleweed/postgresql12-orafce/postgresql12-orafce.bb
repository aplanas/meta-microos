SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.4.0+git0.eb5513d"

RPM_NAME = "postgresql12-orafce-4.4.0+git0.eb5513d-1.1.aarch64.rpm"
RPM_HASH = "1de84ac51ef4c59603a93d810470ad895c620cec1c52a2ef3dea6125457e614df6f454e2a55e86536254aa3884dbb97d5e9cf36f3a245e67e16faf6637ddede3"

RPROVIDES:${PN} += "orafce \
postgresql12-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql12-server"

inherit rpm
