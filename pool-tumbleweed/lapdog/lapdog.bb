SUMMARY = "Take actions when specific devices appear/disappear from your LAN"
DESCRIPTION = "lapdog is a service that monitors the presence/absence of the devices \
on your LAN and executes some actions accordingly. \
 \
It pings the devices to discover if they are connected or not. \
And uses their MAC address and not their IP, so it works on networks \
with DHCP."
LICENSE = "GPL-3.0+"

PV = "1.1"

RPM_NAME = "lapdog-1.1-3.9.aarch64.rpm"
RPM_HASH = "615a72778cb12a6c1b3bf10e33e7680118e81c57beea1f9f309eb0e4fc687d3151c0f8ba92146f1490e38e1f8ce695ba1282d94bb392960a97ad492e0b3547dc"

RPROVIDES:${PN} += "config-lapdog \
lapdog"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liboping.so.0 \
libstdc++.so.6 \
systemd"

inherit rpm
