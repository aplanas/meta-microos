SUMMARY = "PostgreSQL module for simple job schedule"
DESCRIPTION = "pg_cron is a simple cron-based job scheduler for PostgreSQL (9.5 or higher) \
that runs inside the database as an extension. It uses the same syntax as \
regular cron, but it allows you to schedule PostgreSQL commands directly from \
the database."
LICENSE = "PostgreSQL"

PV = "1.5.2"

RPM_NAME = "postgresql11-pg_cron-1.5.2-1.3.aarch64.rpm"
RPM_HASH = "8bbb0698711699c5e0d94969fc67d2949ea549e9b6238014005c162aa06db4b47a12be16566a31d57ba5191b8eecb221748c28c592d73cbdbd707e48ed3c7bc6"

RPROVIDES:${PN} += "postgresql11-pg-cron \
postgresql11-pg-cron-llvmjit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
postgresql11-server"

inherit rpm
