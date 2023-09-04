SUMMARY = "Development files for the libfabric library"
DESCRIPTION = "libfabric provides a user-space API to access high-performance fabric \
services, such as RDMA. This package contains the development files."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "1.18.1"

RPM_NAME = "libfabric-devel-1.18.1-2.1.aarch64.rpm"
RPM_HASH = "546f2027ce96eb01876563281089d24798d6a9f1ece49c9d7cb21d2f943fe19737d3adb281b66eca22565d4c69c9fc6717d4c1ef0fd1dc63dbf457bd4dceb2d8"

RPROVIDES:${PN} += "libfabric-devel \
pkgconfig-libfabric"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfabric1"

inherit rpm
