SUMMARY = "Introspection bindings for the GNOME Desktop API library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons. \
 \
This package provides the GObject Introspection bindings for \
libgnome-desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "typelib-1_0-GnomeRR-4_0-44.0-1.2.aarch64.rpm"
RPM_HASH = "c9618945840bda75dd7a1a48d192a61ab5a51665fb68de1bf0888cf08320fb7e09dce9765c0c7d2ba1d59e8ee5c90c3a35445c841f5a23ad7b5eb48b35b01dcd"

RPROVIDES:${PN} += "typelib-1-0-GnomeRR-4-0 \
typelib-GnomeRR"

RDEPENDS:${PN} += "libgnome-rr-4.so.2 \
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
