SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.3.0+git0.fac8b9c"

RPM_NAME = "postgresql13-orafce-4.3.0+git0.fac8b9c-1.1.aarch64.rpm"
RPM_HASH = "4d02d797840e1e7b86615e86ef918d53ff5978fbfad2c967c431c4b14ca44eb861256527b15a9e30a2e64cd24e9942959b9eb9aff645311cdbc0fb41d9961b7e"

RPROVIDES:${PN} += "orafce \
postgresql13-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql13-server"

inherit rpm
