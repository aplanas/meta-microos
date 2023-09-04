SUMMARY = "Multiple Host Ping Library that supports ICMPv4 and ICMPv6"
DESCRIPTION = "liboping is a C library for measuring network latency using ICMP echo \
requests. It can send to and receive packets from multiple hosts in parallel, \
which is nice for monitoring applications. Both IPv4 and IPv6 are supported \
transparently for the programmer and user. \
 \
A program called oping is available on the oping package to show the \
simplicity and potential of the library and provide the functionality at the \
command line."
LICENSE = "LGPL-2.1-only"

PV = "1.10.0"

RPM_NAME = "liboping0-1.10.0-1.20.aarch64.rpm"
RPM_HASH = "aa52c5218c57e3fde770d3d617ec9090c03b5f85ca1a05b279494becc643a22709fd10dd3ffddedf1490cccb853ba24df1bfc3097ead7cf1cc3875fcddb88e1a"

RPROVIDES:${PN} += "liboping \
liboping.so.0 \
liboping0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
