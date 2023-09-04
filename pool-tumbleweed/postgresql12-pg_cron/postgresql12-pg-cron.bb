SUMMARY = "PostgreSQL module for simple job schedule"
DESCRIPTION = "pg_cron is a simple cron-based job scheduler for PostgreSQL (9.5 or higher) \
that runs inside the database as an extension. It uses the same syntax as \
regular cron, but it allows you to schedule PostgreSQL commands directly from \
the database."
LICENSE = "PostgreSQL"

PV = "1.5.2"

RPM_NAME = "postgresql12-pg_cron-1.5.2-1.3.aarch64.rpm"
RPM_HASH = "be2dd999672854402fa89f9b94b705a20283f98034e9960647afebc1b11e6cc0545c7a4770a2998dc6619cd1e89a7f5512b54e19c8e475f5f2523d2153072d92"

RPROVIDES:${PN} += "postgresql12-pg-cron \
postgresql12-pg-cron-llvmjit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
postgresql12-server"

inherit rpm
