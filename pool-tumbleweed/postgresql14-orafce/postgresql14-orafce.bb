SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.4.0+git0.eb5513d"

RPM_NAME = "postgresql14-orafce-4.4.0+git0.eb5513d-1.1.aarch64.rpm"
RPM_HASH = "19e3e6753a9b0455b91ee94f4a86792dec33a0c54dfcbe6f580ef1fc8ef711ec41c8062ef7d27f3e6f1cd29f6972cba774be1f8c47f7996b0823e54ca95f05bd"

RPROVIDES:${PN} += "orafce \
postgresql14-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql14-server"

inherit rpm
