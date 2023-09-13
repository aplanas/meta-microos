SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.6.0+git0.6020b1e"

RPM_NAME = "postgresql15-orafce-4.6.0+git0.6020b1e-1.1.aarch64.rpm"
RPM_HASH = "181c094a1b068bfb376a7322ba63d03fc21f5c507c4aa3ea6b262488d48c39303a8858a7530e975ba8475e4ec0a86b406445bfe648a89803ec9cef358e046fc7"

RPROVIDES:${PN} += "orafce \
postgresql15-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql15-server"

inherit rpm
