SUMMARY = "Job scheduler for PostgreSQL"
DESCRIPTION = "pgAgent is a job scheduler for PostgreSQL which may be managed \
using pgAdmin."
LICENSE = "PostgreSQL"

PV = "4.2.2"

RPM_NAME = "postgresql11-pgagent-4.2.2-2.3.aarch64.rpm"
RPM_HASH = "8c651caaa260d10b7c9e93e71ea35f7de6c8fc18803ba8f3af28b32767a8e906dd327aface72427af9140f3983a2c75bc2e0348466226c73af7fb8eb4b2b451a"

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
