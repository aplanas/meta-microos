SUMMARY = "Development files for the libfabric library"
DESCRIPTION = "libfabric provides a user-space API to access high-performance fabric \
services, such as RDMA. This package contains the development files."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "1.18.1"

RPM_NAME = "libfabric-devel-1.18.1-1.1.aarch64.rpm"
RPM_HASH = "ef827ce014df0917c8d85dcdc95e4ac52841d692593806c1cf0dbe04382d6050f29e78112e69663eb2591cf9be68d0ccde5de30f0ba3c4c27f950f4ce6fd4b06"

RPROVIDES:${PN} += "libfabric-devel \
pkgconfig-libfabric"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfabric1"

inherit rpm
