SUMMARY = "GTK based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing GTK based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-ui-gtk-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "cadb4eac95f1d8f768a0dc0e52811950e6691b84888b06a8d56a6954b62aabf0ce45c196726ca12800596dfe2ef0f9d51879d83880b3a463c5257d4f969d1417"

RPROVIDES:${PN} += "qemu-ui-gtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libepoxy.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpixman-1.so.0 \
libvte-2.91.so.0 \
qemu-ui-opengl"

inherit rpm
