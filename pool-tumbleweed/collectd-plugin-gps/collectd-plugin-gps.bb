SUMMARY = "GPSD monitoring plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor gpsd."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-gps-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "0c55c01456684b9d7e94a4a3cd416d1e81dacae396065603172d1c7e7f39d3b8bcf02ef6a3f04221dd30e4ff095cef99e995bf58e89fbd9dcf21e23f7f222114"

RPROVIDES:${PN} += "collectd-plugin-gps \
collectd-plugin-gps(aarch-64)"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgps.so.30()(64bit)"

inherit rpm
