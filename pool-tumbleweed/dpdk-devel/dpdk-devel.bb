SUMMARY = "Data Plane Development Kit development files"
DESCRIPTION = "This package contains the headers and other files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-devel-22.11.1-2.15.aarch64.rpm"
RPM_HASH = "6f5dc6505d558cdd2e044438feb61a70962c1ea56e1037ec10a15f4e921de8d7bb9ade261de2d6e9ba9fd53a9d84223ffa9b193d2edcf6ec680daa30d10d6d35"

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
