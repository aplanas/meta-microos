SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for the \
libedataserver library."
LICENSE = "LGPL-2.0-only"

PV = "3.48.4"

RPM_NAME = "typelib-1_0-EDataServerUI-1_2-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "617da1dcfea9f77439df5622a877e4bb98810f3202ee8e216a3dc793cf27d262a73a41fc83a794a15801adc6ac77f0f24950a1dde5856e7919b4e1443365c096"

RPROVIDES:${PN} += "typelib-1-0-EDataServerUI-1-2 \
typelib-EDataServerUI"

RDEPENDS:${PN} += "libcamel-1.2.so.64 \
libecal-2.0.so.2 \
libedataserver-1.2.so.27 \
libedataserverui-1.2.so.4 \
typelib-Atk \
typelib-Camel \
typelib-ECal \
typelib-EDataServer \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-ICalGLib \
typelib-Json \
typelib-Pango \
typelib-Soup \
typelib-cairo \
typelib-freetype2 \
typelib-libxml2 \
typelib-xlib"

inherit rpm
