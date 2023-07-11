SUMMARY = "UDP over TCP/ICMP/UDP tunnel"
DESCRIPTION = "A tunnel which turns UDP traffic into encrypted UDP/FakeTCP/ICMP traffic \
by using raw sockets that can help bypass UDP firewalls (or \
unstable UDP environments)."
LICENSE = "MIT"

PV = "20200818.0"

RPM_NAME = "udp2raw-tunnel-20200818.0-2.4.aarch64.rpm"
RPM_HASH = "ebf3a55c79c8b2a132ef89e8e67295c300101a6d1c126237b48381a379b1422a0f6af5f53e535ada6dba16e358edded9e9665d89ceefd161517fb65d6c3f8d4b"

RPROVIDES:${PN} += "config-udp2raw-tunnel \
udp2raw-tunnel"

RDEPENDS:${PN} += "iptables \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
