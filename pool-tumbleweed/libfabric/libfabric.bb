SUMMARY = "User-space RDMA Fabric Interfaces"
DESCRIPTION = "libfabric provides a user-space API to access high-performance fabric \
services, such as RDMA. This package only contains the fi_info binary."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "1.18.1"

RPM_NAME = "libfabric-1.18.1-1.1.aarch64.rpm"
RPM_HASH = "748d52b59d05b8bc8177e00a54417d56a8f19c4d14b92f9a7b4f81269a1c495b23ee5f36bef9b94a4b6d6ebebd8e90e31278ffb6cebc03f80413d29959381959"

RPROVIDES:${PN} += "libfabric"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfabric.so.1"

inherit rpm
