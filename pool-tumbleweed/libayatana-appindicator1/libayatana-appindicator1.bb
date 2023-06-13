SUMMARY = "Ayatana application indicators library"
DESCRIPTION = "A library to allow applications to add an icon into the \
StatusNotifier-compatible notification area. If none are available, \
it also provides an XEmbed-tray fallback."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "0.5.91"

RPM_NAME = "libayatana-appindicator1-0.5.91-1.4.aarch64.rpm"
RPM_HASH = "ca15613e81574d694bd5d3ecc48a9ac562484da8e4cae382eae728fb4f59ebff8dace22cc161c518bab7e530b5cc5f5b0dda3f90b28ab7b9e4346bd34f8d0edf"

RPROVIDES:${PN} += "libayatana-appindicator \
libayatana-appindicator.so.1()(64bit) \
libayatana-appindicator1 \
libayatana-appindicator1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libayatana-indicator.so.7()(64bit) \
libc.so.6()(64bit) \
libdbusmenu-glib.so.4()(64bit) \
libdbusmenu-gtk.so.4()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
