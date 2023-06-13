SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.2.6+git0.86d7f4c"

RPM_NAME = "postgresql11-orafce-4.2.6+git0.86d7f4c-1.2.aarch64.rpm"
RPM_HASH = "486bcc78261f25b7e7ed92b740d58c02f3314240c3fda8bf904a54d6a8af84c664fd3269b4587bd4e0814028ddb353dd77e08f693c0dbdc50d199afed8b817a7"

RPROVIDES:${PN} += "orafce \
postgresql11-orafce \
postgresql11-orafce(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
postgresql11-server"

inherit rpm
