SUMMARY = "User-space RDMA fabric interfaces"
DESCRIPTION = "libfabric provides a user-space API to access high-performance fabric \
services, such as RDMA. This package contains the runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "1.18.1"

RPM_NAME = "libfabric1-1.18.1-2.1.aarch64.rpm"
RPM_HASH = "18544df09cde89ca435f2d78dbae8549b195d57f69e0adf585a33b144507b62ae4258a0a0bc30a4b986a8ce005bfa65e5b23e70d881e2c2d1defc6a4885b2679"

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
