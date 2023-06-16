SUMMARY = "PostgreSQL module for simple job schedule"
DESCRIPTION = "pg_cron is a simple cron-based job scheduler for PostgreSQL (9.5 or higher) \
that runs inside the database as an extension. It uses the same syntax as \
regular cron, but it allows you to schedule PostgreSQL commands directly from \
the database."
LICENSE = "PostgreSQL"

PV = "1.5.2"

RPM_NAME = "postgresql15-pg_cron-1.5.2-1.2.aarch64.rpm"
RPM_HASH = "15da9a53a9a511b2a5203b7c6068d03f3bbb3d2044bea3060c5383ae783411343584f73e53920b38ea13ff7807a9dcd783fadb733a49836a3bb472c62dc25a86"

RPROVIDES:${PN} += "postgresql15-pg-cron \
postgresql15-pg-cron-llvmjit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
postgresql15-server"

inherit rpm
