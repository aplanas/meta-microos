SUMMARY = "A Featureful Unicode Character Map -- Introspection bindings"
DESCRIPTION = "Gucharmap is a featureful unicode character map. \
 \
This package provides the GObject Introspection bindings for the \
gucharmap library."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "15.0.4"

RPM_NAME = "typelib-1_0-Gucharmap-2_90-15.0.4-1.1.aarch64.rpm"
RPM_HASH = "0920b5661d63b7ecee33b28cea0bcd2d0582f24d5da6373a6534eca000c5d3ace8a1ce0e2dea008c88b6f2831db964919b94d3d8b324558df1f4c373e4f05bde"

RPROVIDES:${PN} += "typelib(Gucharmap) \
typelib-1_0-Gucharmap-2_90 \
typelib-1_0-Gucharmap-2_90(aarch-64)"

RDEPENDS:${PN} += "libgucharmap_2_90.so.7()(64bit) \
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
