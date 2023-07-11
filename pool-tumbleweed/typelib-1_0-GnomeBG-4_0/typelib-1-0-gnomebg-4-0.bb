SUMMARY = "Introspection bindings for the GNOME Desktop API library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons. \
 \
This package provides the GObject Introspection bindings for \
libgnome-desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "typelib-1_0-GnomeBG-4_0-44.0-1.2.aarch64.rpm"
RPM_HASH = "cca6582cb44e0803d05f9fd3ce8ca2fe2ea3a8d6c024bd927db0d526a385de87f05f8c5b5b1c6201e9eee719be15f912703b4f1b770739a28e5c047406e4cf89"

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
