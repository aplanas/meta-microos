SUMMARY = "UDP over TCP/ICMP/UDP tunnel"
DESCRIPTION = "A tunnel which turns UDP traffic into encrypted UDP/FakeTCP/ICMP traffic \
by using raw sockets that can help bypass UDP firewalls (or \
unstable UDP environments)."
LICENSE = "MIT"

PV = "20200818.0"

RPM_NAME = "udp2raw-tunnel-20200818.0-2.3.aarch64.rpm"
RPM_HASH = "cb5e9c5115b384c1ec9e580fc0e50862a9e0072e7bc74fe7132043a1968a107d7d7bb49cd2a34414016e117cbd2a1349ef99000434778fa7c4d6e9ee14d33dbb"

RPROVIDES:${PN} += "config-udp2raw-tunnel \
udp2raw-tunnel"

RDEPENDS:${PN} += "iptables \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
