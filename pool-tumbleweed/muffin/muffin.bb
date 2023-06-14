SUMMARY = "Cinnamon Desktop default window manager"
DESCRIPTION = "Cinnamon Desktop default window manager. \
Muffin uses GTK+ and Clutter to do everything."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.2.1"

RPM_NAME = "muffin-5.2.1-1.1.aarch64.rpm"
RPM_HASH = "6ac300e8a7423949fae58206bd1dad6f6b7870b0f871547ca9118e1411a5683ac6d80bb549a707dd0af51a175c820c1f08581fa7e1b1fa8ba9a440553e6f88ea"

RPROVIDES:${PN} += "libmuffin-clutter-0.so \
libmuffin-cogl-0.so \
libmuffin-cogl-pango-0.so \
libmuffin-cogl-path-0.so \
muffin \
windowmanager"

RDEPENDS:${PN} += "cinnamon-gschemas \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXrandr.so.2 \
libXtst.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libfontconfig.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libmuffin.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
zenity"

inherit rpm
