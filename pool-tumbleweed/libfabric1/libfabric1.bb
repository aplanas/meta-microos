SUMMARY = "User-space RDMA fabric interfaces"
DESCRIPTION = "libfabric provides a user-space API to access high-performance fabric \
services, such as RDMA. This package contains the runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "1.18.1"

RPM_NAME = "libfabric1-1.18.1-1.1.aarch64.rpm"
RPM_HASH = "7cb0562658c86d9e4150cd1f28174280390d5b4b86e4cbad762bd012fa13d8aff5a93fd1c845fcc491da4b8b23ae1686519ceb4aa6757b5cd4ec2016914200a8"

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
