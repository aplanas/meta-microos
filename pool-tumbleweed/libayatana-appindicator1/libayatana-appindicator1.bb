SUMMARY = "Ayatana application indicators library"
DESCRIPTION = "A library to allow applications to add an icon into the \
StatusNotifier-compatible notification area. If none are available, \
it also provides an XEmbed-tray fallback."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "0.5.91"

RPM_NAME = "libayatana-appindicator1-0.5.91-1.5.aarch64.rpm"
RPM_HASH = "aa5d2af33cd8e27b24f17eff8054e93bf6f6a150517555e0f39e28d4eb0f62110dd3710ae1d49d8d6e2cd35b0a4f6d496c489a9ebef3c6540f98aa24b7aea672"

RPROVIDES:${PN} += "libayatana-appindicator \
libayatana-appindicator.so.1 \
libayatana-appindicator1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libayatana-indicator.so.7 \
libc.so.6 \
libdbusmenu-glib.so.4 \
libdbusmenu-gtk.so.4 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
