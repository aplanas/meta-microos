SUMMARY = "Layer-2 Ethernet pinger"
DESCRIPTION = "Arping is a util to find out it a specific IP address on the LAN is \
'taken' and what MAC address owns it. It is designed to work on \
unrouted networks and with ICMP-blocking hosts."
LICENSE = "GPL-2.0-or-later"

PV = "2.23"

RPM_NAME = "arping2-2.23-1.6.aarch64.rpm"
RPM_HASH = "9ba817ad51c1db96b3c8a24bf1169558faf68e97bd15b417c8d1ae7e3d51380c97a864b693b64dfc6b4dfc254679fd77d1c18a1e867f6036679cd3b3ce1ec385"

RPROVIDES:${PN} += "arping2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libnet.so.9 \
libpcap.so.1"

inherit rpm
