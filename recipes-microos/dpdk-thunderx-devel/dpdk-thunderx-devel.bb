SUMMARY = "Data Plane Development Kit development files (thunderx)"
DESCRIPTION = "This package contains the headers and other files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-devel-22.11.1-2.1.aarch64.rpm"
RPM_HASH = "af001c21cc2abb5c4da5ce28b910599f7753e598eabd1aa82cdc7a87bb47cefc68930393ec872b5b7f81a8d38eccdba9f71dd5c0b40cc4b3a60c7e723bc010e9"

RPROVIDES:${PN} += "dpdk-any-devel dpdk-thunderx-devel dpdk-thunderx-devel(aarch-64) pkgconfig(libdpdk) pkgconfig(libdpdk-libs)"
RDEPENDS:${PN} += "/sbin/ldconfig /usr/bin/pkg-config libdpdk-23 pkgconfig(jansson) pkgconfig(libcrypto) pkgconfig(libdpdk-libs) pkgconfig(libelf) pkgconfig(libibverbs) pkgconfig(libmlx4) pkgconfig(libmlx5) pkgconfig(libpcap) pkgconfig(zlib)"

inherit rpm
