SUMMARY = "Eekboard libraries -- Introspection bindings"
DESCRIPTION = "This package contains the libraries for eekboard"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.8"

RPM_NAME = "typelib-1_0-Eek-0_90-1.0.8-10.9.aarch64.rpm"
RPM_HASH = "e02a9b07719566407895a6515b423c3c7f319548ea1290c7a0e1de4a32cf557f50f92058ee8cebb26116e5fcf5006e075b58b43229b3e7667751bb9b234f2b18"

RPROVIDES:${PN} += "typelib-1-0-Eek-0-90 \
typelib-Eek \
typelib-EekGtk \
typelib-EekXkl \
typelib-Eekboard"

RDEPENDS:${PN} += "eekboard \
libeek-gtk.so.0 \
libeek-xkl.so.0 \
libeek.so.0 \
libeekboard.so.0 \
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
