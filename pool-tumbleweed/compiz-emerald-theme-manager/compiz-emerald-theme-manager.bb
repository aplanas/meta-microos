SUMMARY = "Graphical theme manager for Emerald"
DESCRIPTION = "Emerald is a themeable window decorator for Compiz. \
 \
This package contains a graphical theme manager."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-emerald-theme-manager-0.8.18-2.14.aarch64.rpm"
RPM_HASH = "1a4de26ae62a5911a7295ee1a2a322e22d24b01586406cf6e7cc6bfe79569dfe5d0b5444fbc3992117470e74f1419c0afa375f14e2a89a20695e855e5830a6aa"

RPROVIDES:${PN} += "compiz-emerald-theme-manager"

RDEPENDS:${PN} += "compiz-emerald \
ld-linux-aarch64.so.1 \
libc.so.6 \
libemeraldengine.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
