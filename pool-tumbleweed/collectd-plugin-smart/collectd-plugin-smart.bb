SUMMARY = "SMART Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor Self-Monitoring, Analysis and Reporting \
Technology (SMART) information from disk drives."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-smart-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "2f9f04013d9b2808ceee331ac9f09e73ac0dcc23c071f61cb2f03cc013d9139fc439a15de57d1dcb6505b47f2158793a6d8f7ef577436d84af6dfc455fb5603c"

RPROVIDES:${PN} += "collectd-plugin-smart"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libatasmart.so.4 \
libc.so.6 \
libudev.so.1"

inherit rpm
