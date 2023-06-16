SUMMARY = "Job scheduler for PostgreSQL"
DESCRIPTION = "pgAgent is a job scheduler for PostgreSQL which may be managed \
using pgAdmin."
LICENSE = "PostgreSQL"

PV = "4.2.2"

RPM_NAME = "postgresql14-pgagent-4.2.2-2.2.aarch64.rpm"
RPM_HASH = "b1f889b5c0354efd63697d2eb6eaaa699e55e4ac81b47011ed8b4c27959f2f0d3ede3f51bfc4e70a6cb1cc323f9ebdd2707855a21535d764f81a2a17085e637d"

RPROVIDES:${PN} += "config-postgresql14-pgagent \
postgresql14-pgagent"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6 \
postgresql14-server \
shadow \
systemd"

inherit rpm
