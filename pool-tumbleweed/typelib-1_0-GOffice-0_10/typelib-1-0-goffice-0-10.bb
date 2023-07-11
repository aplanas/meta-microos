SUMMARY = "Introspection bindings for GOffice"
DESCRIPTION = "GOffice is a GLib/GTK+ set of document-centric objects and utilities. \
 \
This package provides the GObject Introspection bindings for GOffice."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.10.55"

RPM_NAME = "typelib-1_0-GOffice-0_10-0.10.55-1.4.aarch64.rpm"
RPM_HASH = "48bb70a3daaf1547b6b8c47f38e9469fbd396e9303b2a81e42b854106f396db5d23cb233dac69e2fcbd389b16579d7cf8b941730582ec668aa55b9a3ab959e28"

RPROVIDES:${PN} += "typelib-1-0-GOffice-0-10 \
typelib-GOffice"

RDEPENDS:${PN} += "libgoffice-0.10.so.10 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gsf \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-libxml2 \
typelib-xlib"

inherit rpm
