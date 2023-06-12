SUMMARY = "Introspection bindins for libgladeui"
DESCRIPTION = "Glade is a RAD tool to develop user interfaces for the Gtk+ 3 toolkit \
and the GNOME desktop environment. \
 \
This package provides the GObject Introspection bindings for the \
libgladeui library."
LICENSE = "GPL-2.0-or-later"

PV = "3.40.0"

RPM_NAME = "typelib-1_0-Gladeui-2_0-3.40.0-2.3.aarch64.rpm"
RPM_HASH = "7422216a200ca735bbdb8805b55af7997e829836b319afa7d2d3a342b03eafd26a7423a0aeae10815d5fc1a7da564145f73f7e034f1fdbf9312412be54ed6e2b"

RPROVIDES:${PN} += "typelib(Gladeui) \
typelib-1_0-Gladeui-2_0 \
typelib-1_0-Gladeui-2_0(aarch-64)"
RDEPENDS:${PN} += "libgladeui-2.so.13()(64bit) \
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
