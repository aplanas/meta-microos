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

RPM_NAME = "liboping0-1.10.0-1.19.aarch64.rpm"
RPM_HASH = "c334aa9bf43cf0cfea6dfd994661ed27613434279f57739f202c1fc31600bb3e50c356a365dfb56476701e2453bd7905fd6821e2612d47e969d227e4a2f33501"

RPROVIDES:${PN} += "liboping \
liboping.so.0 \
liboping0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
