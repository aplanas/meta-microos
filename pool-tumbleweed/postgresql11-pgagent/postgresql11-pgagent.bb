SUMMARY = "Job scheduler for PostgreSQL"
DESCRIPTION = "pgAgent is a job scheduler for PostgreSQL which may be managed \
using pgAdmin."
LICENSE = "PostgreSQL"

PV = "4.2.2"

RPM_NAME = "postgresql11-pgagent-4.2.2-2.2.aarch64.rpm"
RPM_HASH = "a65f5627266574ad8205c49a8a298c84c23e1eaf7767e4039f8585d28186e2b759633e83b24e0c8fb772f011bb281f9bddff81cee62982a9e5b5265e8639adf8"

RPROVIDES:${PN} += "config-postgresql11-pgagent \
postgresql11-pgagent"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6 \
postgresql11-server \
shadow \
systemd"

inherit rpm
