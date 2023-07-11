SUMMARY = "Introspection bindings for libgnomekbd"
DESCRIPTION = "GNOME keyboard library and utility. \
 \
This package provides the GObject Introspection bindings for \
libgnomekbd."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28.1"

RPM_NAME = "typelib-1_0-Gkbd-3_0-3.28.1-1.4.aarch64.rpm"
RPM_HASH = "22768ad1d33486ec1a2da786b0581e8711bc104ab4046ceb492574e5fadc0fb64d3cce8fe29314a9c3bda361b0616e6bbd73a4b3e43f2cbf2b8e14f6febbb396"

RPROVIDES:${PN} += "typelib-1-0-Gkbd-3-0 \
typelib-Gkbd"

RDEPENDS:${PN} += "libgnomekbd.so.8 \
libgnomekbdui.so.8 \
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
typelib-Xkl \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
