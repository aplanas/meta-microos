SUMMARY = "Userspace RDMA Connection Manager"
DESCRIPTION = "librdmacm provides a userspace RDMA Communication Management API."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "librdmacm1-45.0-1.2.aarch64.rpm"
RPM_HASH = "cccf43367ea9ee65b673d4426fd8d576e32353f38caf5e32a6ce04f4d5df0a870a399edf08db614c0a26cfadd113aba167968212412d601cc7edf8e5286ce407"

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
