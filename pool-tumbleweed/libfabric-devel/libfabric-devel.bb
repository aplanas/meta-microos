SUMMARY = "Development files for the libfabric library"
DESCRIPTION = "libfabric provides a user-space API to access high-performance fabric \
services, such as RDMA. This package contains the development files."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "1.19.0"

RPM_NAME = "libfabric-devel-1.19.0-1.1.aarch64.rpm"
RPM_HASH = "86477e5cba4de874181732cdca40c146bb43617a8c6e5873cd74d64be9f4960299dc26eb273b735de1e3a2d50a030e7572b62b5b887906c46cbdc3dd2f7c5734"

RPROVIDES:${PN} += "libfabric-devel \
pkgconfig-libfabric"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfabric1"

inherit rpm
