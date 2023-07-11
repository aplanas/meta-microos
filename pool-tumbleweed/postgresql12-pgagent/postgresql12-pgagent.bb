SUMMARY = "Job scheduler for PostgreSQL"
DESCRIPTION = "pgAgent is a job scheduler for PostgreSQL which may be managed \
using pgAdmin."
LICENSE = "PostgreSQL"

PV = "4.2.2"

RPM_NAME = "postgresql12-pgagent-4.2.2-2.3.aarch64.rpm"
RPM_HASH = "f5449fbda977afc49157aba051e04d4b4dccebe33e1a976f63278c19de8f83e90c525e5ba5653712c659d45f824ad1fc963e356e261905d3736469a6af098ac9"

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
