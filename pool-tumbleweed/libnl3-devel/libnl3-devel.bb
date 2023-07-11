SUMMARY = "Libraries and headers for libnl"
DESCRIPTION = "The libnl suite is a collection of libraries providing APIs to \
Netlink protocol based Linux kernel interfaces."
LICENSE = "LGPL-2.1-only"

PV = "3.7.0"

RPM_NAME = "libnl3-devel-3.7.0-1.5.aarch64.rpm"
RPM_HASH = "393da3aee2fb885e846bca5956bdc1f05151f57a97d1bf5a22d6f6022ed1e74810d04a8e7ed94e4967e6ebb02223ce1cd36dfacb3258a7c6f1164d5f17d5f9e1"

RPROVIDES:${PN} += "libnl-devel \
libnl3-devel \
pkgconfig-libnl-3.0 \
pkgconfig-libnl-cli-3.0 \
pkgconfig-libnl-genl-3.0 \
pkgconfig-libnl-idiag-3.0 \
pkgconfig-libnl-nf-3.0 \
pkgconfig-libnl-route-3.0 \
pkgconfig-libnl-xfrm-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnl3-200 \
pkgconfig-libnl-3.0 \
pkgconfig-libnl-genl-3.0 \
pkgconfig-libnl-nf-3.0 \
pkgconfig-libnl-route-3.0"

inherit rpm
