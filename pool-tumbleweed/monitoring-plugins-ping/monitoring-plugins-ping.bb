SUMMARY = "Check connection statistics"
DESCRIPTION = "Use ping to check connection statistics for a remote host. \
 \
This plugin uses the ping command to probe the specified host for packet loss \
(percentage) and round trip average (milliseconds)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-ping-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "0252cb02955386852cf4ada7638ab0aefb0fbb53d3a0b5e0cb17b8312da93ecaa68b57eafc2c72b7208f18854f9f91df9bc7944df57356d7346d948c52c5ef04"

RPROVIDES:${PN} += "config-monitoring-plugins-ping \
monitoring-plugins-ping \
nagios-plugins-ping"

RDEPENDS:${PN} += "iputils \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
