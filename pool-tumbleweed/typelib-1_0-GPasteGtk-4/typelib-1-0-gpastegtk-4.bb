SUMMARY = "Introspection bindings for the gpaste clipboard history manager"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides the GObject Introspection bindings for the library \
managing clipboard history."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "typelib-1_0-GPasteGtk-4-43.2+6-2.1.aarch64.rpm"
RPM_HASH = "5b9ca9ac9be82d7357f62d99f30b59e54ff40e27d185f6ed692202bb32943d4f0b066cb68a21fd7efd564add47a6c9e5f371faf82552e3300893d17b726a9287"

RPROVIDES:${PN} += "typelib(GPasteGtk) \
typelib-1_0-GPasteGtk-4 \
typelib-1_0-GPasteGtk-4(aarch-64)"
RDEPENDS:${PN} += "libgpaste-gtk4.so.0()(64bit) \
typelib(Adw) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(GPaste) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Graphene) \
typelib(Gsk) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(PangoCairo) \
typelib(cairo) \
typelib(freetype2)"

inherit rpm
