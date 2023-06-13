SUMMARY = "DBD driver for PostgreSQL"
DESCRIPTION = "DBD driver for PostgreSQL database."
LICENSE = "Apache-2.0"

PV = "1.6.3"

RPM_NAME = "libapr-util1-0-dbd-pgsql-1.6.3-1.2.aarch64.rpm"
RPM_HASH = "55f8e0b19bc195a9532022f6e1dc07c0f3c6bd0c35261d5e092daff0ddbe4be28909a4dc25f168ea685dd1f7958a8f28b3f82b1919ace975fb2ec06c80bb8b60"

RPROVIDES:${PN} += "libapr-util1-0-dbd-pgsql \
libapr-util1-0-dbd-pgsql(aarch-64)"

RDEPENDS:${PN} += "libapr-util1-0 \
libc.so.6()(64bit) \
libpq.so.5()(64bit)"

inherit rpm
