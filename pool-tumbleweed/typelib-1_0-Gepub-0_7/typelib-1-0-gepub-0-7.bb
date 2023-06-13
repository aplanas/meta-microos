SUMMARY = "Introspection bindings for libgepub"
DESCRIPTION = "A GObject-based library for handling and rendering EPUB documents."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.0"

RPM_NAME = "typelib-1_0-Gepub-0_7-0.7.0-1.3.aarch64.rpm"
RPM_HASH = "175fde59dcdac20f05ad97ae63168eec8b98390c5eb0a9631bce8a3111ca836a042d892b3528eefbde35feba40d3d7befb8d0119412c44e47771589cf4709b9a"

RPROVIDES:${PN} += "typelib(Gepub) \
typelib-1_0-Gepub-0_7 \
typelib-1_0-Gepub-0_7(aarch-64)"

RDEPENDS:${PN} += "libgepub-0.7.so.0()(64bit) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(JavaScriptCore) \
typelib(Pango) \
typelib(Soup) \
typelib(WebKit2) \
typelib(cairo) \
typelib(freetype2) \
typelib(libxml2) \
typelib(xlib)"

inherit rpm
