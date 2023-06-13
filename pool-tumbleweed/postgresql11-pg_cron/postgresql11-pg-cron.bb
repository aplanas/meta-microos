SUMMARY = "PostgreSQL module for simple job schedule"
DESCRIPTION = "pg_cron is a simple cron-based job scheduler for PostgreSQL (9.5 or higher) \
that runs inside the database as an extension. It uses the same syntax as \
regular cron, but it allows you to schedule PostgreSQL commands directly from \
the database."
LICENSE = "PostgreSQL"

PV = "1.5.2"

RPM_NAME = "postgresql11-pg_cron-1.5.2-1.2.aarch64.rpm"
RPM_HASH = "bd876ebc7c4a8925e97dd0848d955d6f7ed777d5f0e25d2edc871d89e6a406545144ffe60f95cab23095c70f96d01c4f6b9ff9a8a8ef9492f0f3da8b0ce8946b"

RPROVIDES:${PN} += "postgresql11-pg_cron \
postgresql11-pg_cron(aarch-64) \
postgresql11-pg_cron-llvmjit"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpq.so.5()(64bit) \
postgresql11-server"

inherit rpm
