SUMMARY = "PostgreSQL module for simple job schedule"
DESCRIPTION = "pg_cron is a simple cron-based job scheduler for PostgreSQL (9.5 or higher) \
that runs inside the database as an extension. It uses the same syntax as \
regular cron, but it allows you to schedule PostgreSQL commands directly from \
the database."
LICENSE = "PostgreSQL"

PV = "1.5.2"

RPM_NAME = "postgresql12-pg_cron-1.5.2-1.2.aarch64.rpm"
RPM_HASH = "a1ba488438af600bcf1d969be669118aa6860ff8e80ac09453bd7dd6d10cdd3fc04fe4f416c2a0fcd3ecd156039ac2d84051e23769c78274fd91afb4fdc1b84e"

RPROVIDES:${PN} += "postgresql12-pg-cron \
postgresql12-pg-cron-llvmjit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
postgresql12-server"

inherit rpm
