SUMMARY = "A GTK4 BitTorrent Client"
DESCRIPTION = "Fragments is an easy to use BitTorrent client which follows the \
GNOME HIG and includes well thought-out features."
LICENSE = "GPL-3.0-only"

PV = "2.1"

RPM_NAME = "Fragments-2.1-3.1.aarch64.rpm"
RPM_HASH = "4cf16049dcb9d8640855ece822d17fdeb4ebe551c173dc928eb0cd2a6a9b09eadff6b6c5c1370d5b1acdb2e4fd9ad17ea375dd89c4621689ef526cd39ee6b46d"

RPROVIDES:${PN} += "Fragments \
Fragments(aarch-64) \
application() \
application(de.haeckerfelix.Fragments.desktop) \
metainfo() \
metainfo(de.haeckerfelix.Fragments.metainfo.xml) \
mimehandler(application/x-bittorrent) \
mimehandler(x-scheme-handler/magnet)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libssl.so.3()(64bit) \
libz.so.1()(64bit) \
transmission-daemon"

inherit rpm
