SUMMARY = "GObject introspection bindings for libbrasero-media"
DESCRIPTION = "Brasero is an application for the GNOME Desktop to write CD/DVDs. \
 \
This package provides the GObject Introspection bindings for the \
libbrasero-media library."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3"

RPM_NAME = "typelib-1_0-BraseroMedia-3_2_0-3.12.3-2.8.aarch64.rpm"
RPM_HASH = "5056b9fc0857ad28c80adfeb9b43a5736e24eddf387aaac011150305613ec67acdd470320ce84ccb4195b281c158c6b1f66406bec1f9c82b2082b0502b8644cd"

RPROVIDES:${PN} += "typelib-1-0-BraseroMedia-3-2-0 \
typelib-BraseroMedia"

RDEPENDS:${PN} += "libbrasero-media3.so.1 \
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
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
