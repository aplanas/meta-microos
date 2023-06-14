SUMMARY = "PostgreSQL module for simple job schedule"
DESCRIPTION = "pg_cron is a simple cron-based job scheduler for PostgreSQL (9.5 or higher) \
that runs inside the database as an extension. It uses the same syntax as \
regular cron, but it allows you to schedule PostgreSQL commands directly from \
the database."
LICENSE = "PostgreSQL"

PV = "1.5.2"

RPM_NAME = "postgresql14-pg_cron-1.5.2-1.2.aarch64.rpm"
RPM_HASH = "b98977cb2175fa31b3d2ee4cdb0e4432dc98a005044e4525ccef1e5f48e6aa4653d807350c5380ab3ef57ccabe7fdcc50b959c47935f5e7d29c443075f3b51c1"

RPROVIDES:${PN} += "postgresql14-pg-cron \
postgresql14-pg-cron-llvmjit"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
postgresql14-server"

inherit rpm
