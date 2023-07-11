SUMMARY = "LXC container runtime library development files"
DESCRIPTION = "This package provides the LXC container runtime library development files."
LICENSE = "LGPL-2.1-only"

PV = "5.0.2"

RPM_NAME = "liblxc-devel-5.0.2-1.2.aarch64.rpm"
RPM_HASH = "03d3d0ef15042c67b00263743d5562a941f50ce0ad17c738885c256c3bee120d225caf7724f0b6dbb3d4622095af92e6bbbe42fa756392dee0de61f6eb68d481"

RPROVIDES:${PN} += "liblxc-devel \
pkgconfig-lxc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblxc1 \
pkgconfig-libcap \
pkgconfig-libseccomp \
pkgconfig-libselinux"

inherit rpm
