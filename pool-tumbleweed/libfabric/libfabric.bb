SUMMARY = "User-space RDMA Fabric Interfaces"
DESCRIPTION = "libfabric provides a user-space API to access high-performance fabric \
services, such as RDMA. This package only contains the fi_info binary."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "1.19.0"

RPM_NAME = "libfabric-1.19.0-1.1.aarch64.rpm"
RPM_HASH = "53425cfff2f92d33bdf4a28a76a5d2b3ef633e4697a093b8019c58325207b1eb577c39d7123ceee62b014a8356726c94de56c92a4918396bb72d6b404123760d"

RPROVIDES:${PN} += "libfabric"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfabric.so.1"

inherit rpm
