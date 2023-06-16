SUMMARY = "GTK2 IM Module for UIM"
DESCRIPTION = "Contains GTK+2.0 IM module for uim"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & (BSD-3-Clause | LGPL-2.0-only)"

PV = "1.8.8"

RPM_NAME = "uim-gtk2-1.8.8-9.9.aarch64.rpm"
RPM_HASH = "5f76f956b4d26ce9cb93799260f618dfd8e58f7af3ae6f29c328b8c4844a980d8f84dc4849ac3bf83ed9b561804fde2f2d8c13fcdfd1cba620a31bbf7dae5ae9"

RPROVIDES:${PN} += "uim-gtk2"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2-tools \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libuim-custom.so.2 \
libuim-scm.so.0 \
libuim.so.8 \
uim"

inherit rpm
