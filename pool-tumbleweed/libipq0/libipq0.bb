SUMMARY = "Library to interface with the (old) ip_queue kernel mechanism"
DESCRIPTION = "The Netfilter project provides a mechanism (ip_queue) for passing \
packets out of the stack for queueing to userspace, then receiving \
these packets back into the kernel with a verdict specifying what to \
do with the packets (such as ACCEPT or DROP). These packets may also \
be modified in userspace prior to reinjection back into the kernel. \
 \
ip_queue/libipq is obsoleted by nf_queue/libnetfilter_queue!"
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.9"

RPM_NAME = "libipq0-1.8.9-1.3.aarch64.rpm"
RPM_HASH = "6a6912a25c8c919ce0f7f88df0544222ae2f0c4aeea99da092d3c69642f65dd10a8782322a4b40528e506df088b24b36651866b2acc52a270d20c85592884663"

RPROVIDES:${PN} += "libipq.so.0()(64bit) \
libipq0 \
libipq0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
