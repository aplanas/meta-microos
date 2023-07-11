SUMMARY = "DBD driver for PostgreSQL"
DESCRIPTION = "DBD driver for PostgreSQL database."
LICENSE = "Apache-2.0"

PV = "1.6.3"

RPM_NAME = "libapr-util1-0-dbd-pgsql-1.6.3-1.3.aarch64.rpm"
RPM_HASH = "2f971b5f6557760faff306dc4f98551a95c1fff686ef8c58703276f88c8518c61d3861b2666c90f127a352db456341f153d28e5b4a0d83a322bcc71d5ab77ccc"

RPROVIDES:${PN} += "libapr-util1-0-dbd-pgsql"

RDEPENDS:${PN} += "libapr-util1-0 \
libc.so.6 \
libpq.so.5"

inherit rpm
