SUMMARY = "Data Plane Development Kit development files (thunderx)"
DESCRIPTION = "This package contains the headers and other files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-devel-22.11.1-2.9.aarch64.rpm"
RPM_HASH = "2c63094c0000945353c23c332362da05fc7219f195ca93b2e88dafb6e06a20c03c4bd15a8e89c7a2424b8a3c500f6d7a469db79d02d8ce0c986c648c125aeade"

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
