SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.2.6+git0.86d7f4c"

RPM_NAME = "postgresql13-orafce-4.2.6+git0.86d7f4c-1.2.aarch64.rpm"
RPM_HASH = "794bc1501b101fda6a0c735dd4189e89948ced5c510159655d68f38cc7e03856bf397dba332c306eb868c6eae420a799fce01c42a1d40d57f12639d01df983e3"

RPROVIDES:${PN} += "orafce \
postgresql13-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql13-server"

inherit rpm
