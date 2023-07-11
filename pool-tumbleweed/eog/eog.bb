SUMMARY = "Image Viewer for GNOME"
DESCRIPTION = "Eye of GNOME (eog) is a simple graphics viewer for the GNOME desktop \
which uses the gdk-pixbuf library. It can deal with large images, and \
zoom and scroll with constant memory usage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "44.3"

RPM_NAME = "eog-44.3-1.1.aarch64.rpm"
RPM_HASH = "462ec04448d0cf698dfe738b0ab875157c543189606ae7f455881a831b3291f2efbb66bfb1d890d8efacd85f15b2b8460b480adf4de40d2ebe5823d49ff885d8"

RPROVIDES:${PN} += "eog \
libeog.so \
libfullscreen.so \
libreload.so \
libstatusbar-date.so \
typelib-Eog"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libexempi.so.8 \
libexif.so.12 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgnome-desktop-3.so.20 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libpeas-1.0.so.0 \
libpeas-gtk-1.0.so.0 \
librsvg-2.so.2 \
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
typelib-xlib"

inherit rpm
