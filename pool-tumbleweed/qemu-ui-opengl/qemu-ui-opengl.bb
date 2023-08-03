SUMMARY = "OpenGL based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing OpenGL based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-ui-opengl-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "5072a132227c1dc54308628af5c8e0f82beadc8271509512be7343f0f90557154b1d5ed48fe4522c5e26e5c605dff878504361343610b9123da9ef3c00045408"

RPROVIDES:${PN} += "qemu-ui-opengl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libgbm.so.1 \
libpixman-1.so.0"

inherit rpm
