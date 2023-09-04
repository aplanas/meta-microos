SUMMARY = "OpenGL based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing OpenGL based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-ui-opengl-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "0b5fea2e546be5da79bff075bdb0ea89e27fead44eaf061354fed366a33705ef2039488b24093570f9d4fb2601d5cf65ea0db830316e199fb363e5ca4c7e22ad"

RPROVIDES:${PN} += "qemu-ui-opengl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libgbm.so.1 \
libpixman-1.so.0"

inherit rpm
