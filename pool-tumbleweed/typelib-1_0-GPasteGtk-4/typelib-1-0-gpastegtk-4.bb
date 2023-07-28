SUMMARY = "Introspection bindings for the gpaste clipboard history manager"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides the GObject Introspection bindings for the library \
managing clipboard history."
LICENSE = "BSD-2-Clause"

PV = "44.1"

RPM_NAME = "typelib-1_0-GPasteGtk-4-44.1-1.1.aarch64.rpm"
RPM_HASH = "5f3d401c47c4308aeed77d9415bf3134bce135bf23d33e519ae4a60543f441d3236268a412652cfcb7b9a73037f8bd1a60799000d31b30d88ebfeef2b699ffc3"

RPROVIDES:${PN} += "typelib-1-0-GPasteGtk-4 \
typelib-GPasteGtk"

RDEPENDS:${PN} += "libgpaste-gtk4.so.0 \
typelib-Adw \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GPaste \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
