SUMMARY = "Data Plane Development Kit development files"
DESCRIPTION = "This package contains the headers and other files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-devel-22.11.1-2.4.aarch64.rpm"
RPM_HASH = "a9f61e0b7c253f74f8ccb030accc4bb4e60c7f6b43d7e874e5962caa06348c716e5a1629ef7c30a690e2c4e1ca1b691005378bf5cb449518b2fa73ddab61a0e4"

RPROVIDES:${PN} += "dpdk-any-devel dpdk-devel dpdk-devel(aarch-64) pkgconfig(libdpdk) pkgconfig(libdpdk-libs)"
RDEPENDS:${PN} += "/sbin/ldconfig /usr/bin/pkg-config libdpdk-23 pkgconfig(jansson) pkgconfig(libcrypto) pkgconfig(libdpdk-libs) pkgconfig(libelf) pkgconfig(libibverbs) pkgconfig(libmlx4) pkgconfig(libmlx5) pkgconfig(libpcap) pkgconfig(zlib)"

inherit rpm
