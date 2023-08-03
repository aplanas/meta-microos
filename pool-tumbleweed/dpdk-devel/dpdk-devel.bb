SUMMARY = "Data Plane Development Kit development files"
DESCRIPTION = "This package contains the headers and other files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-devel-22.11.1-2.12.aarch64.rpm"
RPM_HASH = "1646c9df599086222c519c071096d7f71d639a6a34c3e42a3dcae9a3df3199fdc51299236f4b3fbd415da54214eab603b3b2bdcafbffccef47b229f6f5d9abbf"

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
