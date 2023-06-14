SUMMARY = "Introspection bindings for the GNOME Desktop API library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons. \
 \
This package provides the GObject Introspection bindings for \
libgnome-desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "typelib-1_0-GnomeRR-4_0-44.0-1.1.aarch64.rpm"
RPM_HASH = "711a295b604ec6aa0b6ecd4edf7c38df9a472ee44ff075397f4606758bdde418fd7d70eb80afcbe4a1961f6567324d2946d2a8b4c472d2057b3328d6126502aa"

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
