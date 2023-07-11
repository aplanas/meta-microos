SUMMARY = "Job scheduler for PostgreSQL"
DESCRIPTION = "pgAgent is a job scheduler for PostgreSQL which may be managed \
using pgAdmin."
LICENSE = "PostgreSQL"

PV = "4.2.2"

RPM_NAME = "postgresql14-pgagent-4.2.2-2.3.aarch64.rpm"
RPM_HASH = "c4d0d8fe7f7a320fe0a5470082b29629705608507c75c36d450708007bc50e7e436d2dd59e17b1594922412dfa9f2d49ad96857f03198adc11166321b32994b3"

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
