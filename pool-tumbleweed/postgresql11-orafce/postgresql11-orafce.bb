SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.5.0+git8.b3ad258"

RPM_NAME = "postgresql11-orafce-4.5.0+git8.b3ad258-1.2.aarch64.rpm"
RPM_HASH = "eb235ae0d6c399938ceb5a64e38ef53c4681b200d36dab287a8c28234ab9e554daa1ad2e6238ac63a1c9710aeeffb166687a5390d236bedf69e34e70d5312b20"

RPROVIDES:${PN} += "orafce \
postgresql11-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql11-server"

inherit rpm
