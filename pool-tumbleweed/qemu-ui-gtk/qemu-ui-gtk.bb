SUMMARY = "GTK based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing GTK based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-ui-gtk-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "3683b7b97c0e0c59ea8c8cc65018720bb6cc0cf0b9587d3839d90b8149613c9d5c194a0449e693e9710f76d14c601013378582b32d94e78fa0f6596105ebadc8"

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
