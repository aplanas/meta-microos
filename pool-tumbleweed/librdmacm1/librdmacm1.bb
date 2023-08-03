SUMMARY = "Userspace RDMA Connection Manager"
DESCRIPTION = "librdmacm provides a userspace RDMA Communication Management API."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "librdmacm1-47.0-1.1.aarch64.rpm"
RPM_HASH = "e6ec8ebe7b7b6504ee2c69a9e2779147d1e498efe068ff6fce8109901bc4e9493bfd82398c695ccad7558909e8b19b54699fe8b1e5ce60bcc8e6947c44235761"

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
