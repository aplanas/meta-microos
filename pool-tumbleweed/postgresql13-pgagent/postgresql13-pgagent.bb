SUMMARY = "Job scheduler for PostgreSQL"
DESCRIPTION = "pgAgent is a job scheduler for PostgreSQL which may be managed \
using pgAdmin."
LICENSE = "PostgreSQL"

PV = "4.2.2"

RPM_NAME = "postgresql13-pgagent-4.2.2-2.2.aarch64.rpm"
RPM_HASH = "e5ce36b46166d9f576a9b11993a98f3232556ed4cb9b593fa8fef2f89d36199d2491d48db0fcbd0542f4f84b7fc5b6894d066f6641498fcdd55728d396d84d76"

RPROVIDES:${PN} += "config-postgresql13-pgagent \
postgresql13-pgagent"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6 \
postgresql13-server \
shadow \
systemd"

inherit rpm
