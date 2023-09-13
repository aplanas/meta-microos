SUMMARY = "User-space RDMA fabric interfaces"
DESCRIPTION = "libfabric provides a user-space API to access high-performance fabric \
services, such as RDMA. This package contains the runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "1.19.0"

RPM_NAME = "libfabric1-1.19.0-1.1.aarch64.rpm"
RPM_HASH = "b0d97e224878781af7a821a18c7427d2a45b40031087a6a87a56e1ce2fe0e9f552af52dee720e56812742a0c55ebc8f4e44a90bf98c59fe6fcff45b34b6c39c5"

RPROVIDES:${PN} += "libfabric.so.1 \
libfabric1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatomic.so.1 \
libc.so.6 \
libefa.so.1 \
libibverbs.so.1 \
libnl-3.so.200 \
librdmacm.so.1"

inherit rpm
