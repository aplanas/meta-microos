SUMMARY = "Job scheduler for PostgreSQL"
DESCRIPTION = "pgAgent is a job scheduler for PostgreSQL which may be managed \
using pgAdmin."
LICENSE = "PostgreSQL"

PV = "4.2.2"

RPM_NAME = "postgresql12-pgagent-4.2.2-2.2.aarch64.rpm"
RPM_HASH = "cccd3738f789f9f59144818fb9755ec1312c9bb1901a909d841be84520c08c21febaa5f4780525a1140c6b5cec4fdf248f800f4f9ccee4c2c596d4ade8569f95"

RPROVIDES:${PN} += "config-postgresql12-pgagent \
postgresql12-pgagent"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6 \
postgresql12-server \
shadow \
systemd"

inherit rpm
