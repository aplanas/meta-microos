SUMMARY = "GNU Data Access (GDA) Library - UI Widgets -- Introspection bindings"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data. \
 \
This package provides the GObject Introspection bindings for \
libgda-ui."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "typelib-1_0-Gdaui-6_0-6.0.0-6.8.aarch64.rpm"
RPM_HASH = "a6ef2df615929fe45baf892bb9c8d9b8c58aa06586d052830e2510f39741dd7e9b842e837d08a07d2a0331219efe8a5c624766b987a69fa7aa0416f780cb0021"

RPROVIDES:${PN} += "typelib-1-0-Gdaui-6-0 \
typelib-Gdaui"

RDEPENDS:${PN} += "libgda-ui-6.0.so.6.0.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gda \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-libxml2 \
typelib-xlib"

inherit rpm
