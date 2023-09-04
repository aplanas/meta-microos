SUMMARY = "Multiple Host Ping that supports ICMPv4 and ICMPv6"
DESCRIPTION = "oping is for measuring network latency using ICMP echo requests. It can send \
to and receive packets from multiple hosts in parallel, which is nice for \
monitoring applications. Both IPv4 and IPv6 are supported transparently."
LICENSE = "GPL-2.0-only"

PV = "1.10.0"

RPM_NAME = "oping-1.10.0-1.20.aarch64.rpm"
RPM_HASH = "924baba981da9a7cbad98b456628f43714f5af7abc224584f19328ac4ad7f46dcfc92e728950e3e91d9d78b81bb4277cd0fbdb7310c1dcf840f38c3b6366050f"

RPROVIDES:${PN} += "oping"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liboping \
liboping.so.0"

inherit rpm
