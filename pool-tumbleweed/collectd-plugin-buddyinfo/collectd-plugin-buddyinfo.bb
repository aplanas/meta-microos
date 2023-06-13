SUMMARY = "Buddyinfo plugin for collectd"
DESCRIPTION = "Optional collectd plugin for memory fragmentation."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-buddyinfo-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "2bffccd5f344036eb30bb46d5b0baf449db9ac0c75077fa29a7a3e13dc8a9ca7f6fa3119185bd11d572f2c0484cf115316f2768b1619aa696c6b593bf8980991"

RPROVIDES:${PN} += "collectd-plugin-buddyinfo \
collectd-plugin-buddyinfo(aarch-64)"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
