SUMMARY = "Userspace RDMA Connection Manager"
DESCRIPTION = "librdmacm provides a userspace RDMA Communication Management API."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "librdmacm1-47.0-3.1.aarch64.rpm"
RPM_HASH = "30be2a47788cc375e8cfc64d43fab4d0f7f2bcfebbceb4a22f56d2a773a8ba15d5afc8482796fd081df0b043d1ac0f045efc1afbb5e6abafa6c9445969a906d6"

RPROVIDES:${PN} += "librdmacm \
librdmacm.so.1 \
librdmacm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1 \
libnl-3.so.200 \
rdma-core"

inherit rpm
