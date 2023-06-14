SUMMARY = "GTK based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing GTK based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-ui-gtk-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "12c9fa3013fd482944e255b8ee24b95c3167db77961a2e62b3278f53e03ae6e038d700ba23555df0d33da7cfc1097f505ca9370fabf208085bf3c141fbeaa259"

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
