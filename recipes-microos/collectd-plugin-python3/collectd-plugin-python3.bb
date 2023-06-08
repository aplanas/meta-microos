SUMMARY = "Python3 API for collectd"
DESCRIPTION = "Optional collectd Python3 API in order to write collectd plugins in \
Python3."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-python3-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "5c3b3cea37208fccf12f30410e16b34afc3baf0aec85396df7ba0847575d0539d3157c183b71b9e571e93c4fd250ddae473aa7965ff8a3092679f0b96b499e9a"

RPROVIDES:${PN} += "collectd-plugin-python3 collectd-plugin-python3(aarch-64)"
RDEPENDS:${PN} += "collectd ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpython3.10.so.1.0()(64bit)"

inherit rpm
