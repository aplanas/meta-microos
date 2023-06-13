SUMMARY = "Network analysis and testing tools"
DESCRIPTION = "Tcpreplay is a suite of utilities for editing and replaying \
previously captured network traffic. It was originally designed to \
replay malicious traffic patterns to Intrusion Detection/Prevention \
Systems, and is meanwhile capable of replaying to web servers. It \
supports switches, routers and IP Flow/NetFlow appliances."
LICENSE = "GPL-3.0-only"

PV = "4.4.3"

RPM_NAME = "tcpreplay-4.4.3-1.3.aarch64.rpm"
RPM_HASH = "bc736a817d5c372eb1fd8fcbd35533991e4af3d9982ab7c3616fd9a1312b159b506a27ab9f3f34d192203403287f6ccdabd300a054ce3518167b4724229d2c1d"

RPROVIDES:${PN} += "tcpreplay \
tcpreplay(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdnet.so.1()(64bit) \
libpcap.so.1()(64bit) \
tcpdump"

inherit rpm
