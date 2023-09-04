SUMMARY = "Network analysis and testing tools"
DESCRIPTION = "Tcpreplay is a suite of utilities for editing and replaying \
previously captured network traffic. It was originally designed to \
replay malicious traffic patterns to Intrusion Detection/Prevention \
Systems, and is meanwhile capable of replaying to web servers. It \
supports switches, routers and IP Flow/NetFlow appliances."
LICENSE = "GPL-3.0-only"

PV = "4.4.4"

RPM_NAME = "tcpreplay-4.4.4-1.1.aarch64.rpm"
RPM_HASH = "a2e03561d7cb2fda79184e154f52152a9824df5dd3ee6a33ac155df5b7ca42bdd626ebb43ce88d326abacee5c89ed8aac833ecb289000a4466561746d1ab232d"

RPROVIDES:${PN} += "tcpreplay"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdnet.so.1 \
libpcap.so.1 \
tcpdump"

inherit rpm
