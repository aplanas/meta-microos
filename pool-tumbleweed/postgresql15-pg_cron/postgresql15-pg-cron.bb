SUMMARY = "PostgreSQL module for simple job schedule"
DESCRIPTION = "pg_cron is a simple cron-based job scheduler for PostgreSQL (9.5 or higher) \
that runs inside the database as an extension. It uses the same syntax as \
regular cron, but it allows you to schedule PostgreSQL commands directly from \
the database."
LICENSE = "PostgreSQL"

PV = "1.5.2"

RPM_NAME = "postgresql15-pg_cron-1.5.2-1.3.aarch64.rpm"
RPM_HASH = "e59454b721b44f4ad22dee65676bfce20fb01424fe6d4e37d3c7c1da8ba81060fd56c070a34199c03adcd5b12c48991d264c058ac3f0fb2bb27e020e5792d79a"

RPROVIDES:${PN} += "postgresql15-pg-cron \
postgresql15-pg-cron-llvmjit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
postgresql15-server"

inherit rpm
