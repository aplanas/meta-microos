SUMMARY = "GlusterFS block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over a \
GlusterFS network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-block-gluster-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "25a0806cafeaf02eccfc49ff8759f5ef7c0192a6abfba0d99c6bf268dfecccf7cf6299808e458e597a480640a398c82d471048e538cbde2ba9ab204ff40824bf"

RPROVIDES:${PN} += "qemu-block-gluster"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgfapi.so.0"

inherit rpm
