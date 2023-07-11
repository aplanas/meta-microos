SUMMARY = "Job scheduler for PostgreSQL"
DESCRIPTION = "pgAgent is a job scheduler for PostgreSQL which may be managed \
using pgAdmin."
LICENSE = "PostgreSQL"

PV = "4.2.2"

RPM_NAME = "postgresql15-pgagent-4.2.2-2.3.aarch64.rpm"
RPM_HASH = "0cc040e390c709bc183627374e80a9eabfa4b4cae75555e87baa1b68dd056f3caee8b1c12af4acc4488f093ee8dc3d10d4d02caa301d8496d92bcf230b290c01"

RPROVIDES:${PN} += "config-postgresql15-pgagent \
postgresql15-pgagent"

RDEPENDS:${PN} += "/usr/bin/sh \
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
