SUMMARY = "Take actions when specific devices appear/disappear from your LAN"
DESCRIPTION = "lapdog is a service that monitors the presence/absence of the devices \
on your LAN and executes some actions accordingly. \
 \
It pings the devices to discover if they are connected or not. \
And uses their MAC address and not their IP, so it works on networks \
with DHCP."
LICENSE = "GPL-3.0+"

PV = "1.1"

RPM_NAME = "lapdog-1.1-3.8.aarch64.rpm"
RPM_HASH = "3cb5862ade6e75eb3cb7e075dd4af4476940525de7b2079c46b6b6b018f4d53d981fb15fc349e8f1c9a17275edd4a009767ee35c604d519682db4323c3f16f40"

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
