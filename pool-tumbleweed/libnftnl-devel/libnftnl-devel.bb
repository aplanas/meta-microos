SUMMARY = "Development files for libnftnl"
DESCRIPTION = "libnftnl is a userspace library providing a low-level netlink \
programming interface (API) to the in-kernel nf_tables subsystem. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libnftnl."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "libnftnl-devel-1.2.5-1.2.aarch64.rpm"
RPM_HASH = "a6dee0c17752e00d8e3efe65e325c2a833fd986bbc8ded79d3acb2456f3f055efd01a6152c0a92a6083931e0184d6c850b946837056096c379697f5c02f90612"

RPROVIDES:${PN} += "libnftnl-devel \
libnftnl-devel(aarch-64) \
pkgconfig(libnftnl)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnftnl11 \
pkgconfig(libmnl)"

inherit rpm
