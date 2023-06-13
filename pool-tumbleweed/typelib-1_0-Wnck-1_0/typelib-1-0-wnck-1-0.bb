SUMMARY = "Window Navigator Construction Kit (Library Package) -- Introspection bindings"
DESCRIPTION = "The Window Navigator Construction Kit is a library that can be used to \
write task lists, pagers, and similar GNOME programs. \
 \
This package provides the GObject Introspection bindings for libwnck."
LICENSE = "LGPL-2.1-or-later"

PV = "2.31.0"

RPM_NAME = "typelib-1_0-Wnck-1_0-2.31.0-13.3.aarch64.rpm"
RPM_HASH = "958da8406c7d1cf42f5b6863cb6fe4f5b1a3f6a7c0690da4f780846e5657532c81231091ce85662a0d059efc0196ea10cf6e6f9cdbe4ca8627883ba7809c61ab"

RPROVIDES:${PN} += "typelib(Wnck) \
typelib-1_0-Wnck-1_0 \
typelib-1_0-Wnck-1_0(aarch-64)"

RDEPENDS:${PN} += "libwnck-1.so.22()(64bit) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2)"

inherit rpm
