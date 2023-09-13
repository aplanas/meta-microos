SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.6.0+git0.6020b1e"

RPM_NAME = "postgresql14-orafce-4.6.0+git0.6020b1e-1.1.aarch64.rpm"
RPM_HASH = "a1dd138c235121a892000b9909e2670e2073a4e8a84a751592cb644a416f4a4ee59dbd4f64bc20e189f26bc33524eea977358bf393792e6a11fddbbac7f85681"

RPROVIDES:${PN} += "orafce \
postgresql14-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql14-server"

inherit rpm
