SUMMARY = "PostgreSQL module for simple job schedule"
DESCRIPTION = "pg_cron is a simple cron-based job scheduler for PostgreSQL (9.5 or higher) \
that runs inside the database as an extension. It uses the same syntax as \
regular cron, but it allows you to schedule PostgreSQL commands directly from \
the database."
LICENSE = "PostgreSQL"

PV = "1.5.2"

RPM_NAME = "postgresql13-pg_cron-1.5.2-1.3.aarch64.rpm"
RPM_HASH = "218065a5f98f054c4ae6d29fbccf690c04c034b251ffceb21d9956a19d97ff68762419a2911eede1469ae35abd851076d3f73df2df88623d267aad498d1514e6"

RPROVIDES:${PN} += "postgresql13-pg-cron \
postgresql13-pg-cron-llvmjit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
postgresql13-server"

inherit rpm
