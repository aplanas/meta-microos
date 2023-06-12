SUMMARY = "GTK3 IM Module for UIM"
DESCRIPTION = "Contains GTK+3.0 IM module for uim"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & (BSD-3-Clause | LGPL-2.0-only)"

PV = "1.8.8"

RPM_NAME = "uim-gtk3-1.8.8-9.9.aarch64.rpm"
RPM_HASH = "95ab7958a68aa054fa22cc207a5aa02bc6517395f7732e8f7c81cb24a1eaa81658d529c14147606482a94555d773534acbe2d1d4b6da20283ed0bbecee85e09c"

RPROVIDES:${PN} += "uim-gtk3 \
uim-gtk3(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
gtk3-tools \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libuim-custom.so.2()(64bit) \
libuim-scm.so.0()(64bit) \
libuim.so.8()(64bit) \
uim"

inherit rpm
