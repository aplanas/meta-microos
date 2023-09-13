SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.6.0+git0.6020b1e"

RPM_NAME = "postgresql12-orafce-4.6.0+git0.6020b1e-1.1.aarch64.rpm"
RPM_HASH = "56992fe1b3c8b6bd4f90814766118b60ed9d372423e82700c615451a1153871b4844dec0cd8a54ee940a7ace6a4a3cd2150c2702071bed7917ae34acc84ba5c1"

RPROVIDES:${PN} += "orafce \
postgresql12-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql12-server"

inherit rpm
