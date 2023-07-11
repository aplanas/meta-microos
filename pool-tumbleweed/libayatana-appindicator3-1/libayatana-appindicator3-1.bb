SUMMARY = "Ayatana application indicators library"
DESCRIPTION = "A library to allow applications to add an icon into the \
StatusNotifier-compatible notification area. If none are available, \
it also provides an XEmbed-tray fallback."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "0.5.91"

RPM_NAME = "libayatana-appindicator3-1-0.5.91-1.5.aarch64.rpm"
RPM_HASH = "bfa78485a489bc06205a0c3c72cec93dc2616197e5e2e0974f2e421c85362366ae8df34e97a9f7f88b16c723602f558e82fd3ed3360aabcb45e2314cff949456"

RPROVIDES:${PN} += "libayatana-appindicator3 \
libayatana-appindicator3-1 \
libayatana-appindicator3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libayatana-indicator3.so.7 \
libc.so.6 \
libdbusmenu-glib.so.4 \
libdbusmenu-gtk3.so.4 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
