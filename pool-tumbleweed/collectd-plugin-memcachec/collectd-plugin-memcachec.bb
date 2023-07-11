SUMMARY = "Memcache Daemon Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to sample memcached statistics."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-memcachec-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "72c8af26a9330cb5b4d06044b17098fd4ade09f006b0c1123138e4299cc6416f04c37c076c4ac4d1b44855f39f3694487fd97544f462671293272d035e2501da"

RPROVIDES:${PN} += "collectd-plugin-memcachec"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmemcached.so.11"

inherit rpm
