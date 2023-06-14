SUMMARY = "A font viewer utility for GNOME"
DESCRIPTION = "A utility to let you see the installed fonts at a glance."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-font-viewer-44.0-1.1.aarch64.rpm"
RPM_HASH = "1a70b7ba4fd761db0775b3b2b66bc6c05d388621e2615acf3a57f683ad551c090816a519fd1ad7e9fa434102c573754c65629f1f2aaee58407926d7efacf7350"

RPROVIDES:${PN} += "gnome-font-viewer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libfribidi.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libharfbuzz.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
