SUMMARY = "PostgreSQL Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor PostgreSQL server instances."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-postgresql-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "1eb19f50a8f1990266659600381b72660719134df3abb1a4cbf5c02c4f1d4d38ec09333cf3700d11645a6d5951228e2f9ba0ce62e8339dc2b02a0838a0f1af68"

RPROVIDES:${PN} += "collectd-plugin-postgresql \
config-collectd-plugin-postgresql"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5"

inherit rpm
