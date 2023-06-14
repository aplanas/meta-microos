SUMMARY = "Userspace library for packets that have been queued by the kernel packet filter"
DESCRIPTION = "libnetfilter_queue is a userspace library providing an API to packets \
that have been queued by the kernel packet filter. It is is part of a \
system that deprecates the old ip_queue / libipq mechanism. \
 \
libnetfilter_queue has been previously known as libnfnetlink_queue."
LICENSE = "GPL-2.0-only"

PV = "1.0.5"

RPM_NAME = "libnetfilter_queue-devel-1.0.5-2.10.aarch64.rpm"
RPM_HASH = "17e77f5a371d869f1df0b624b2d9c81e386687e016239a2f436dbca87c0c4d52411e87326ce0f77f30a6222c2da5e101e0af8384680923caeb4dbc918a15b9a4"

RPROVIDES:${PN} += "libnetfilter-queue-devel \
pkgconfig-libnetfilter-queue"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnetfilter-queue1 \
libnfnetlink-devel \
pkgconfig-libnfnetlink"

inherit rpm
