SUMMARY = "GTK2 IM Module for UIM"
DESCRIPTION = "Contains GTK+2.0 IM module for uim"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & (BSD-3-Clause | LGPL-2.0-only)"

PV = "1.8.8"

RPM_NAME = "uim-gtk2-1.8.8-9.9.aarch64.rpm"
RPM_HASH = "5f76f956b4d26ce9cb93799260f618dfd8e58f7af3ae6f29c328b8c4844a980d8f84dc4849ac3bf83ed9b561804fde2f2d8c13fcdfd1cba620a31bbf7dae5ae9"

RPROVIDES:${PN} += "uim-gtk2 \
uim-gtk2(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gtk2-tools \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libuim-custom.so.2()(64bit) \
libuim-scm.so.0()(64bit) \
libuim.so.8()(64bit) \
uim"

inherit rpm
