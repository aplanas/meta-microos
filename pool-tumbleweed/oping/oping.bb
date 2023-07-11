SUMMARY = "Multiple Host Ping that supports ICMPv4 and ICMPv6"
DESCRIPTION = "oping is for measuring network latency using ICMP echo requests. It can send \
to and receive packets from multiple hosts in parallel, which is nice for \
monitoring applications. Both IPv4 and IPv6 are supported transparently."
LICENSE = "GPL-2.0-only"

PV = "1.10.0"

RPM_NAME = "oping-1.10.0-1.19.aarch64.rpm"
RPM_HASH = "8d136129b27a76057638c8027755368270da9b4730be1e071fc453c877285ccdc6280e3c988efe6f02f146e2ad4966ba4c74d0d42003af4574d41db0696fc1e7"

RPROVIDES:${PN} += "oping"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liboping \
liboping.so.0"

inherit rpm
