SUMMARY = "Userspace RDMA Connection Manager"
DESCRIPTION = "librdmacm provides a userspace RDMA Communication Management API."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "librdmacm1-47.0-2.2.aarch64.rpm"
RPM_HASH = "45d1fc1bd9e431473c16ed94e211de2d16d8fc857dc76a25451e717478d70dc95cc550d2591c785b02cfe2b1e939ec7bda5e51b7152836ec7fde87a5fcd9f5fa"

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
