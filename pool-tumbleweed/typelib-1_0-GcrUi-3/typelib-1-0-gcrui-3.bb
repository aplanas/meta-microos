SUMMARY = "Introspection bindings for gcr, a library for crypto UI related tasks"
DESCRIPTION = "GCR is a library for displaying certificates, and crypto UI, accessing \
key stores. \
 \
This package provides the GObject Introspection bindings for GCR."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "typelib-1_0-GcrUi-3-3.41.0-3.4.aarch64.rpm"
RPM_HASH = "d7ebafad1831514599263db51dd0055f228a956942f4ec1e876e81c49b54fe6bac6226e918135c26ae17bbe304a8bccd37affb36b56d6c3fd71dda29385da39d"

RPROVIDES:${PN} += "typelib-1-0-GcrUi-3 \
typelib-GcrUi"

RDEPENDS:${PN} += "libgcr-ui-3.so.1 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gck \
typelib-Gcr \
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
