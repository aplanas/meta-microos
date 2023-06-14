SUMMARY = "GTK3 IM Module for UIM"
DESCRIPTION = "Contains GTK+3.0 IM module for uim"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & (BSD-3-Clause | LGPL-2.0-only)"

PV = "1.8.8"

RPM_NAME = "uim-gtk3-1.8.8-9.9.aarch64.rpm"
RPM_HASH = "95ab7958a68aa054fa22cc207a5aa02bc6517395f7732e8f7c81cb24a1eaa81658d529c14147606482a94555d773534acbe2d1d4b6da20283ed0bbecee85e09c"

RPROVIDES:${PN} += "uim-gtk3"

RDEPENDS:${PN} += "/bin/sh \
gtk3-tools \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libuim-custom.so.2 \
libuim-scm.so.0 \
libuim.so.8 \
uim"

inherit rpm
