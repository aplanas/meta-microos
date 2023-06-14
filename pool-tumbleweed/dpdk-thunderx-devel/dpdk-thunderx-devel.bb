SUMMARY = "Data Plane Development Kit development files (thunderx)"
DESCRIPTION = "This package contains the headers and other files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-devel-22.11.1-2.4.aarch64.rpm"
RPM_HASH = "07e9347b387ba6e95c8ca3f4b0e1db5afe24b514a9934cef4e062edc50c1f7ff12c4dec962a2925592022a7d415a2c0333c4717bf9822cac37621d17fef3e8ac"

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
