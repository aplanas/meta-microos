SUMMARY = "Image Viewer for GNOME"
DESCRIPTION = "Eye of GNOME (eog) is a simple graphics viewer for the GNOME desktop \
which uses the gdk-pixbuf library. It can deal with large images, and \
zoom and scroll with constant memory usage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "44.2"

RPM_NAME = "eog-44.2-1.1.aarch64.rpm"
RPM_HASH = "e9ac5d6e6d849ca91a7f480e05c777cd98e480661ad07560aa0e97d8035cf23eb2b6b8dbbad5c28d7a3e6c8220fcca5237b04ea9432f0cb6991459af8b74b6e1"

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
