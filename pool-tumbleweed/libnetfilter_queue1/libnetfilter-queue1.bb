SUMMARY = "Userspace library for packets that have been queued by the kernel packet filter"
DESCRIPTION = "libnetfilter_queue is a userspace library providing an API to packets \
that have been queued by the kernel packet filter. It is is part of a \
system that deprecates the old ip_queue / libipq mechanism. \
 \
libnetfilter_queue has been previously known as libnfnetlink_queue."
LICENSE = "GPL-2.0-only"

PV = "1.0.5"

RPM_NAME = "libnetfilter_queue1-1.0.5-2.10.aarch64.rpm"
RPM_HASH = "0f42d6a48f0eb71cef4388215d9e1369f5d3325f71b8693611d03984ffc5279c1a77fd57d72c1816e003f525168ea01c2476bfdf87c2dc4b049ee31a13228dcc"

RPROVIDES:${PN} += "libnetfilter_queue.so.1()(64bit) \
libnetfilter_queue1 \
libnetfilter_queue1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmnl.so.0()(64bit) \
libnfnetlink.so.0()(64bit)"

inherit rpm
