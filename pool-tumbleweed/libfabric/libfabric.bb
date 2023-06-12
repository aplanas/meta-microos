SUMMARY = "User-space RDMA Fabric Interfaces"
DESCRIPTION = "libfabric provides a user-space API to access high-performance fabric \
services, such as RDMA. This package only contains the fi_info binary."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "1.18.0"

RPM_NAME = "libfabric-1.18.0-2.1.aarch64.rpm"
RPM_HASH = "fc01b0361d6d3283ded4934f27d40ba60e66855d2fd91ecdec4778e1e6a819b9909aad7bcc70228ef65d7f6c0d7a78dac99bd6224c1492a21680e53e19ae9c50"

RPROVIDES:${PN} += "libfabric \
libfabric(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfabric.so.1()(64bit) \
libfabric.so.1(FABRIC_1.0)(64bit) \
libfabric.so.1(FABRIC_1.1)(64bit) \
libfabric.so.1(FABRIC_1.3)(64bit) \
libfabric.so.1(FABRIC_1.4)(64bit)"

inherit rpm
