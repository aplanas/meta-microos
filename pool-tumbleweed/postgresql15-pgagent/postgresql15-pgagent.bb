SUMMARY = "Job scheduler for PostgreSQL"
DESCRIPTION = "pgAgent is a job scheduler for PostgreSQL which may be managed \
using pgAdmin."
LICENSE = "PostgreSQL"

PV = "4.2.2"

RPM_NAME = "postgresql15-pgagent-4.2.2-2.2.aarch64.rpm"
RPM_HASH = "f9e8e38d2c59df03bb805d7195d7b98f1d8929504a17d32421cc92c4096364ccbda7e6d14bc91daceb6c90ae04465fde1a1f0a40f17eafe513385d9460afc45e"

RPROVIDES:${PN} += "config-postgresql15-pgagent \
postgresql15-pgagent"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6 \
postgresql15-server \
shadow \
systemd"

inherit rpm
