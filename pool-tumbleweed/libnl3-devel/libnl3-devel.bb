SUMMARY = "Libraries and headers for libnl"
DESCRIPTION = "The libnl suite is a collection of libraries providing APIs to \
Netlink protocol based Linux kernel interfaces."
LICENSE = "LGPL-2.1-only"

PV = "3.8.0"

RPM_NAME = "libnl3-devel-3.8.0-1.1.aarch64.rpm"
RPM_HASH = "7c1b948222ae8ff960811e8c54baac5bc7c1bde4947860401e5effaec0d5b00070edda27cab37ec72ee297f64fdba1c26b735df468ee75196beaef5c8580d8a0"

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
