SUMMARY = "Data Plane Development Kit development files (thunderx)"
DESCRIPTION = "This package contains the headers and other files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-devel-22.11.1-2.15.aarch64.rpm"
RPM_HASH = "e217612a1878a5e984c9638bada7f4a0fff7deccb7de9711907ef1a5641624b0be242310ce97a12660d51387a6bb92e52cb4f8e4de387d63fac82db60febf8ec"

RPROVIDES:${PN} += "dpdk-any-devel \
dpdk-thunderx-devel \
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
