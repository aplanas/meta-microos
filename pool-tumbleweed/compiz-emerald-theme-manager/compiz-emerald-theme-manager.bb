SUMMARY = "Graphical theme manager for Emerald"
DESCRIPTION = "Emerald is a themeable window decorator for Compiz. \
 \
This package contains a graphical theme manager."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-emerald-theme-manager-0.8.18-2.14.aarch64.rpm"
RPM_HASH = "1a4de26ae62a5911a7295ee1a2a322e22d24b01586406cf6e7cc6bfe79569dfe5d0b5444fbc3992117470e74f1419c0afa375f14e2a89a20695e855e5830a6aa"

RPROVIDES:${PN} += "application() \
application(emerald-theme-manager.desktop) \
compiz-emerald-theme-manager \
compiz-emerald-theme-manager(aarch-64) \
mimehandler(application/x-emerald-theme)"

RDEPENDS:${PN} += "compiz-emerald \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libemeraldengine.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
