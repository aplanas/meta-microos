SUMMARY = "X.Org font package creation/installation utilities"
DESCRIPTION = "This package provides utilities for X.Org font package \
creation/installation."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "font-util-1.4.0-1.2.aarch64.rpm"
RPM_HASH = "0ce3fc724f6d53796698a3101c2bfa2f4050dade604c9ee7a9bfbbee91c333553dfe21a582e8870276eb4e20d3d61ab61a5cd972054835448e7e0b4ce4aaca28"

RPROVIDES:${PN} += "font-util \
font-util(aarch-64) \
pkgconfig(fontutil) \
xorg-x11-fonts-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
