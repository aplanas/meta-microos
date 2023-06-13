SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.2.6+git0.86d7f4c"

RPM_NAME = "postgresql15-orafce-4.2.6+git0.86d7f4c-1.2.aarch64.rpm"
RPM_HASH = "fea6f9cc73662d732b4f04e27ceb9f623459de94d1024001bc3470644a12f45c11eccf186d24d9d705ba54eeab3b1dd2ba464f789246b871af5474625e866ee6"

RPROVIDES:${PN} += "orafce \
postgresql15-orafce \
postgresql15-orafce(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
postgresql15-server"

inherit rpm
