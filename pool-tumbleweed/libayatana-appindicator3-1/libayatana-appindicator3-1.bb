SUMMARY = "Ayatana application indicators library"
DESCRIPTION = "A library to allow applications to add an icon into the \
StatusNotifier-compatible notification area. If none are available, \
it also provides an XEmbed-tray fallback."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "0.5.91"

RPM_NAME = "libayatana-appindicator3-1-0.5.91-1.4.aarch64.rpm"
RPM_HASH = "add1be32e910a671daaf7bf6386f871b6f42a2f3435479d521680157ab7b3469531fe468cef996484c8b479c951e00891451bd710e4e3c15c37bd4f0e59f9a45"

RPROVIDES:${PN} += "libayatana-appindicator3 \
libayatana-appindicator3-1 \
libayatana-appindicator3-1(aarch-64) \
libayatana-appindicator3.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libayatana-indicator3.so.7()(64bit) \
libc.so.6()(64bit) \
libdbusmenu-glib.so.4()(64bit) \
libdbusmenu-gtk3.so.4()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
