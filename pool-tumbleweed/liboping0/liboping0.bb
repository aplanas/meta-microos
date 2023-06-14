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

RPM_NAME = "liboping0-1.10.0-1.18.aarch64.rpm"
RPM_HASH = "771aedc11f7001c68da6918721d571ce7f8c8ba6751fc4a101da4d0445edea6356145d51f49fc9cc61d27f65e83ae26bdb7e95f42ccf1d74174cc87f1293e0f4"

RPROVIDES:${PN} += "liboping \
liboping.so.0 \
liboping0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
