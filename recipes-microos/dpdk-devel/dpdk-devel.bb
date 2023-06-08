SUMMARY = "Data Plane Development Kit development files"
DESCRIPTION = "This package contains the headers and other files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-devel-22.11.1-2.1.aarch64.rpm"
RPM_HASH = "e8d415625c5dde65c118f40d56929fd50c3d38387b9704a580782dc57fe1d029d7e5073be26084f2e8c36c808b10ee4bd6520125d9866be33a422e5d75edbdb7"

RPROVIDES:${PN} += "dpdk-any-devel dpdk-devel dpdk-devel(aarch-64) pkgconfig(libdpdk) pkgconfig(libdpdk-libs)"
RDEPENDS:${PN} += "/sbin/ldconfig /usr/bin/pkg-config libdpdk-23 pkgconfig(jansson) pkgconfig(libcrypto) pkgconfig(libdpdk-libs) pkgconfig(libelf) pkgconfig(libibverbs) pkgconfig(libmlx4) pkgconfig(libmlx5) pkgconfig(libpcap) pkgconfig(zlib)"

inherit rpm
