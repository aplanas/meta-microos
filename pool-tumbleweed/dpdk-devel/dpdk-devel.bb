SUMMARY = "Data Plane Development Kit development files"
DESCRIPTION = "This package contains the headers and other files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-devel-22.11.1-2.10.aarch64.rpm"
RPM_HASH = "1943e24d308d86f08e022b45205811f57d809aa096a6662ff967adf2002484241ddd90597995cf69995a6f84c077eaf0ef02a22043ce6bea964a03e43594c1f4"

RPROVIDES:${PN} += "dpdk-any-devel \
dpdk-devel \
pkgconfig-libdpdk \
pkgconfig-libdpdk-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
libdpdk-23 \
pkgconfig-jansson \
pkgconfig-libcrypto \
pkgconfig-libdpdk-libs \
pkgconfig-libelf \
pkgconfig-libibverbs \
pkgconfig-libmlx4 \
pkgconfig-libmlx5 \
pkgconfig-libpcap \
pkgconfig-zlib"

inherit rpm
