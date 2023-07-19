SUMMARY = "Development files for libnftnl"
DESCRIPTION = "libnftnl is a userspace library providing a low-level netlink \
programming interface (API) to the in-kernel nf_tables subsystem. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libnftnl."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "libnftnl-devel-1.2.6-1.1.aarch64.rpm"
RPM_HASH = "3b8d2e7b2a02bbb8be8236a9883c1b7719d3772d2fd03346e92f8bc6cd29e6725a422e40b7d32f5ae89c227e747979eadfe3b38035ade452ca51e9631f2836eb"

RPROVIDES:${PN} += "libnftnl-devel \
pkgconfig-libnftnl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnftnl11 \
pkgconfig-libmnl"

inherit rpm
