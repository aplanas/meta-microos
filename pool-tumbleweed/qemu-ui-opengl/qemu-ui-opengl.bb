SUMMARY = "OpenGL based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing OpenGL based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-ui-opengl-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "28b0ccbeac648284f1ca2a628bbec2f635d05b195ca2939767bfcb392edc58758f937dcdbc2ad613696091a88c3792afac587f7fffc85f6647813120c7d8fcbf"

RPROVIDES:${PN} += "qemu-ui-opengl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libgbm.so.1 \
libpixman-1.so.0"

inherit rpm
