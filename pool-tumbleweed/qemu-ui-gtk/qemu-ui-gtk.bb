SUMMARY = "GTK based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing GTK based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-ui-gtk-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "28f8fd044b6ee718587599e2f4f4fb3f6868cb7802327b88a973d77dd980a8523cbe23cefc3442a7125f364cadd524c2d8f4794153012bf64ef40f47b606d85a"

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
