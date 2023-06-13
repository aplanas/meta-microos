SUMMARY = "A font viewer utility for GNOME"
DESCRIPTION = "A utility to let you see the installed fonts at a glance."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-font-viewer-44.0-1.1.aarch64.rpm"
RPM_HASH = "1a70b7ba4fd761db0775b3b2b66bc6c05d388621e2615acf3a57f683ad551c090816a519fd1ad7e9fa434102c573754c65629f1f2aaee58407926d7efacf7350"

RPROVIDES:${PN} += "application() \
application(org.gnome.font-viewer.desktop) \
gnome-font-viewer \
gnome-font-viewer(aarch-64) \
metainfo() \
metainfo(org.gnome.font-viewer.appdata.xml) \
mimehandler(application/x-font-otf) \
mimehandler(application/x-font-pcf) \
mimehandler(application/x-font-ttf) \
mimehandler(application/x-font-type1) \
mimehandler(font/otf) \
mimehandler(font/ttf) \
mimehandler(font/woff)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libfribidi.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgraphene-1.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libharfbuzz.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit)"

inherit rpm
