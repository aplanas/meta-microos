SUMMARY = "User-space RDMA fabric interfaces"
DESCRIPTION = "libfabric provides a user-space API to access high-performance fabric \
services, such as RDMA. This package contains the runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "1.18.0"

RPM_NAME = "libfabric1-1.18.0-2.1.aarch64.rpm"
RPM_HASH = "8c4069cc5fd765daadff95166a4c607c708584c7d1ac382f7dbfe0131ced54ecd117681c57c68299313919367b4bcb606cac5a5a93c2a18aadbe88f7c39f8f3c"

RPROVIDES:${PN} += "libfabric.so.1()(64bit) \
libfabric1 \
libfabric1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libatomic.so.1()(64bit) \
libc.so.6()(64bit) \
libefa.so.1()(64bit) \
libibverbs.so.1()(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
librdmacm.so.1()(64bit)"

inherit rpm
