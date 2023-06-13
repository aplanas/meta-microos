SUMMARY = "Multiple Host Ping that supports ICMPv4 and ICMPv6"
DESCRIPTION = "oping is for measuring network latency using ICMP echo requests. It can send \
to and receive packets from multiple hosts in parallel, which is nice for \
monitoring applications. Both IPv4 and IPv6 are supported transparently."
LICENSE = "GPL-2.0-only"

PV = "1.10.0"

RPM_NAME = "oping-1.10.0-1.18.aarch64.rpm"
RPM_HASH = "cca2e62391ea7841a99115e091b5399c2d4bc440844dde0ed7cee2e14e33ee861cea2f78ef74bcb5ff34d407bb5ba89bf6ccdb7c9eee8cf492dd83425f8fc02e"

RPROVIDES:${PN} += "oping \
oping(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liboping \
liboping.so.0()(64bit)"

inherit rpm
