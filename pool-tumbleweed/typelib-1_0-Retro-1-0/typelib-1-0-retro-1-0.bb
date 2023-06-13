SUMMARY = "GObject introspection bindings for libretro-gtk"
DESCRIPTION = "retro-gtk wraps the libretro API for use in Gtk applications. \
This subpackage contains the gobject bindings for the \
libretro-gtk shared library."
LICENSE = "GPL-3.0-only"

PV = "1.0.2"

RPM_NAME = "typelib-1_0-Retro-1-0-1.0.2-2.7.aarch64.rpm"
RPM_HASH = "264ab967a0d3a2018db53626d600a74326cac83c020dfc74182ef910bc667934ba808beacb132a1ccaf584ea35d3209ba039e8b242bb6eb8b17fb0297c1637c0"

RPROVIDES:${PN} += "typelib(Retro) \
typelib-1_0-Retro-1-0 \
typelib-1_0-Retro-1-0(aarch-64)"

RDEPENDS:${PN} += "libretro-gtk-1.so.0()(64bit) \
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
