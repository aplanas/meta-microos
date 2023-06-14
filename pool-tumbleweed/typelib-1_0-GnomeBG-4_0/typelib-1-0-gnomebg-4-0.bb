SUMMARY = "Introspection bindings for the GNOME Desktop API library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons. \
 \
This package provides the GObject Introspection bindings for \
libgnome-desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "typelib-1_0-GnomeBG-4_0-44.0-1.1.aarch64.rpm"
RPM_HASH = "508facfdb53d427745e17a020c3828557d462ac37e21c5ee11a493c903311810c3b1388f145ad94b5ce6c56d369b6fe331798f0479be58e64cee11001efd0311"

RPROVIDES:${PN} += "typelib-1-0-GnomeBG-4-0 \
typelib-GnomeBG"

RDEPENDS:${PN} += "libgnome-bg-4.so.2 \
typelib-GDesktopEnums \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-GnomeDesktop \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
