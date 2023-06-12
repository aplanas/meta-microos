SUMMARY = "Thunar Extension Library -- Introspection bindings"
DESCRIPTION = "This package provides the GObject Introspection bindings for the Thunar extension library libthunarx-3-0."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.6"

RPM_NAME = "typelib-1_0-Thunarx-3_0-4.18.6-1.1.aarch64.rpm"
RPM_HASH = "793553898f62cdd4c74f84642518738c8d3f13638a511aa0dc48879acbd11298ea30daabc1c07773c9b211a994e85f3ed2c98b547aca7a6205c4680c1cea4841"

RPROVIDES:${PN} += "typelib(Thunarx) \
typelib-1_0-Thunarx-3_0 \
typelib-1_0-Thunarx-3_0(aarch-64)"
RDEPENDS:${PN} += "libthunarx-3.so.0()(64bit) \
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
typelib(freetype2) \
typelib(xlib)"

inherit rpm
