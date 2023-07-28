SUMMARY = "OpenGL based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing OpenGL based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-ui-opengl-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "b60a1ad79d5bfe118928bca680ab0f46a5da12fbc4d426395deedb687de3202d56dd921126acfaffb6d00f475cca9341a9156132015a064b13e64ff0a9c93f0a"

RPROVIDES:${PN} += "qemu-ui-opengl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libgbm.so.1 \
libpixman-1.so.0"

inherit rpm
