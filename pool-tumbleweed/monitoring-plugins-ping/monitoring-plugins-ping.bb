SUMMARY = "Check connection statistics"
DESCRIPTION = "Use ping to check connection statistics for a remote host. \
 \
This plugin uses the ping command to probe the specified host for packet loss \
(percentage) and round trip average (milliseconds)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-ping-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "54b9f03e48accb7642f5c86aa713859252b5fc39e9a4b224db66858598b2a045b84b74927e0c6251e371139a3832aa7a2bee47c66913df7b974d3c4c51c7d1f8"

RPROVIDES:${PN} += "config(monitoring-plugins-ping) \
monitoring-plugins-ping \
monitoring-plugins-ping(aarch-64) \
nagios-plugins-ping"
RDEPENDS:${PN} += "iputils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
