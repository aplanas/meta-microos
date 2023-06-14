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

RPM_NAME = "libipq-devel-1.8.9-1.3.aarch64.rpm"
RPM_HASH = "d34825c03f661cfce288f9f93e0b2898457fe02b2b8c75a46dd528fc86531a2ed054fe741e96d541ae56581d02a87739c2bbb9c448737fe540d091fa50f495bc"

RPROVIDES:${PN} += "libipq-devel \
pkgconfig-libipq"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libipq0"

inherit rpm
