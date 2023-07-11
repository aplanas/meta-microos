SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for the \
libedataserver library."
LICENSE = "LGPL-2.0-only"

PV = "3.48.4"

RPM_NAME = "typelib-1_0-EDataServerUI4-1_0-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "8f3e94627aff48545d8903d124d4331fdd73a05589e777462498d3bba154543cfaad6ea58488b135cd3d5cccf764cee7c34200105cf9a219e8bacad02591f743"

RPROVIDES:${PN} += "typelib-1-0-EDataServerUI4-1-0 \
typelib-EDataServerUI4"

RDEPENDS:${PN} += "libcamel-1.2.so.64 \
libecal-2.0.so.2 \
libedataserver-1.2.so.27 \
libedataserverui4-1.0.so.0 \
typelib-Camel \
typelib-ECal \
typelib-EDataServer \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-HarfBuzz \
typelib-ICalGLib \
typelib-Json \
typelib-Pango \
typelib-PangoCairo \
typelib-Soup \
typelib-cairo \
typelib-freetype2 \
typelib-libxml2"

inherit rpm
