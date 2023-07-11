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

RPM_NAME = "libipq0-1.8.9-1.4.aarch64.rpm"
RPM_HASH = "9c8826a65e04fd0363650fb55e6117381722300714129f3b0b33b5ec2d5105a6e6a752651c4bc5e2746b070c0f1b53a7e8c8dae6eaf20888c8f7b6d5793091b9"

RPROVIDES:${PN} += "libipq.so.0 \
libipq0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
