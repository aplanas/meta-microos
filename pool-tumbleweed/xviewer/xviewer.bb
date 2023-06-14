SUMMARY = "Fast and functional graphics viewer"
DESCRIPTION = "xviewer is a simple graphics viewer for the Cinnamon desktop and \
others which uses the gdk-pixbuf library. It can deal with large \
images, and zoom and scroll with constant memory usage. Its goals \
are simplicity and standards compliance."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.4"

RPM_NAME = "xviewer-3.2.4-1.7.aarch64.rpm"
RPM_HASH = "8791d24584347ec36764ca0ea98ad421d8daad1addfd8c0d857c5196255f2b0fe960ac087484b74d5fa5faf8231d0ed830c5c802ffe4b8258fbf70f06b302262"

RPROVIDES:${PN} += "libxviewer.so \
typelib-Xviewer \
xviewer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libcinnamon-desktop.so.4 \
libexempi.so.8 \
libexif.so.12 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libpeas-1.0.so.0 \
libpeas-gtk-1.0.so.0 \
librsvg-2.so.2 \
libxapp.so.1 \
libz.so.1 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib \
xapps-common"

inherit rpm
