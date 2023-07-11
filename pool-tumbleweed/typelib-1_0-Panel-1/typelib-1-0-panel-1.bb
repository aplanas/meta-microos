SUMMARY = "Typelib files for libpanel"
DESCRIPTION = "Package contains typelib files for use with libpanel."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "typelib-1_0-Panel-1-1.2.0-1.2.aarch64.rpm"
RPM_HASH = "ef0ead5788331c7fb2e7ced437daf5ba5aedb336dbf08f8ce83f7404d55209d8112241856ae5b6681650692c9acf3bd1a375732db2a50a5ae52766e4ec5e9a79"

RPROVIDES:${PN} += "typelib-1-0-Panel-1 \
typelib-Panel"

RDEPENDS:${PN} += "libpanel-1.so.1 \
typelib-Adw \
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
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
