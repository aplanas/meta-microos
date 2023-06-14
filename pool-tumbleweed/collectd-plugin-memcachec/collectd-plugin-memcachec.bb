SUMMARY = "Memcache Daemon Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to sample memcached statistics."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-memcachec-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "59d5fb07552d691d572b7c059c1440be741201fd3bc0ed7e15fd9a2859329d5c062b4c2fdb9b26e1696ac7ced7e9d2b2818406473ad0ff20fbace3978acb6bbc"

RPROVIDES:${PN} += "collectd-plugin-memcachec"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmemcached.so.11"

inherit rpm
