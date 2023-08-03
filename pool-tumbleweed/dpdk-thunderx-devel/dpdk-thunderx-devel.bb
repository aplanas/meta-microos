SUMMARY = "Data Plane Development Kit development files (thunderx)"
DESCRIPTION = "This package contains the headers and other files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-devel-22.11.1-2.12.aarch64.rpm"
RPM_HASH = "dd45ea5670f4bb605112399111d558c5eea17d866b1bc7719d4b88a88d561c25bc088fc515a82cb8eff919d061517dacd214f73d2455258a15cc8c814d39893b"

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
