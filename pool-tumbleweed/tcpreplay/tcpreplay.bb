SUMMARY = "Network analysis and testing tools"
DESCRIPTION = "Tcpreplay is a suite of utilities for editing and replaying \
previously captured network traffic. It was originally designed to \
replay malicious traffic patterns to Intrusion Detection/Prevention \
Systems, and is meanwhile capable of replaying to web servers. It \
supports switches, routers and IP Flow/NetFlow appliances."
LICENSE = "GPL-3.0-only"

PV = "4.4.3"

RPM_NAME = "tcpreplay-4.4.3-1.4.aarch64.rpm"
RPM_HASH = "92c1a9739d8fded39e5a64eeb873f3bd3c0153a15d55a88cba5dd47caf00498f4eee411e920f2034ea53c6227d1c43a158d584bb1ea8cd8f6aa308cb8e9b895d"

RPROVIDES:${PN} += "tcpreplay"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdnet.so.1 \
libpcap.so.1 \
tcpdump"

inherit rpm
