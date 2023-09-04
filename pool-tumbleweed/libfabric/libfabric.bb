SUMMARY = "User-space RDMA Fabric Interfaces"
DESCRIPTION = "libfabric provides a user-space API to access high-performance fabric \
services, such as RDMA. This package only contains the fi_info binary."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "1.18.1"

RPM_NAME = "libfabric-1.18.1-2.1.aarch64.rpm"
RPM_HASH = "e6ff194ceed5bf1d4bcb6c533562d426ef5f2e8c8486ef13d773a12191044a19b7745fd32d5f8039853e35674d2cd5c7b421190edb6da041c7ba3ea6cda7ac68"

RPROVIDES:${PN} += "libfabric"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfabric.so.1"

inherit rpm
