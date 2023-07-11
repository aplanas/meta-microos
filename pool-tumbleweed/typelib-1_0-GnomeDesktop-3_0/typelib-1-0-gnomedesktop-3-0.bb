SUMMARY = "Introspection bindings for the GNOME Desktop API library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons. \
 \
This package provides the GObject Introspection bindings for \
libgnome-desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "typelib-1_0-GnomeDesktop-3_0-44.0-1.2.aarch64.rpm"
RPM_HASH = "0f77c3cac9277d588d16c48944884c9864ebc65d7c1a43768178b9ab49de69eb7c9af24515db7efd478e24e6149fea8007c9e361c071beb8bfe01b807f0f239e"

RPROVIDES:${PN} += "typelib-1-0-GnomeDesktop-3-0 \
typelib-GnomeDesktop"

RDEPENDS:${PN} += "libgnome-desktop-3.so.20 \
typelib-Atk \
typelib-GDesktopEnums \
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
