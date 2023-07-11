SUMMARY = "Introspection bindings for the GNOME Developer Help program"
DESCRIPTION = "Devhelp is an API documentation browser for GTK+ and GNOME. \
 \
This package contains the gobject introspection based typelib library."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "typelib-1_0-Devhelp-3_0-43.0-2.2.aarch64.rpm"
RPM_HASH = "f3f1409ed16b9d3604d00531996dbca81800dc2d00a2d4c12bf5ee564538fcfcebe9b00e23809ee616f4279f18633b60c50455d442d5c9bbc9184c22d59d4abc"

RPROVIDES:${PN} += "typelib-1-0-Devhelp-3-0 \
typelib-Devhelp"

RDEPENDS:${PN} += "libdevhelp-3.so.6 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-JavaScriptCore \
typelib-Pango \
typelib-Soup \
typelib-WebKit2 \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
