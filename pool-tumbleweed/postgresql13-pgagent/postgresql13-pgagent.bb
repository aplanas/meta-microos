SUMMARY = "Job scheduler for PostgreSQL"
DESCRIPTION = "pgAgent is a job scheduler for PostgreSQL which may be managed \
using pgAdmin."
LICENSE = "PostgreSQL"

PV = "4.2.2"

RPM_NAME = "postgresql13-pgagent-4.2.2-2.3.aarch64.rpm"
RPM_HASH = "e26b3933c51b8ff5f6c076c571539aa7286ecd1b0673f32e42b20aca15646d92bbe5f08b5e1eefae2fd3d8b998639562e0424a0679a4bd3eecac4c8e9775a7fc"

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
