SUMMARY = "Development files for the ip_queue kernel mechanism"
DESCRIPTION = "The Netfilter project provides a mechanism (ip_queue) for passing \
packets out of the stack for queueing to userspace, then receiving \
these packets back into the kernel with a verdict specifying what to \
do with the packets (such as ACCEPT or DROP). These packets may also \
be modified in userspace prior to reinjection back into the kernel. \
 \
ip_queue/libipq is obsoleted by nf_queue/libnetfilter_queue!"
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.9"

RPM_NAME = "libipq-devel-1.8.9-1.4.aarch64.rpm"
RPM_HASH = "3e3f6ef20693240ffe20fbe2b9e91deac8f6144f39b457531e8b965c654857360413e1584870638e0862dfbc9ef7d32950cccef1b48b41a016c24e837e8f8994"

RPROVIDES:${PN} += "libipq-devel \
pkgconfig-libipq"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libipq0"

inherit rpm
