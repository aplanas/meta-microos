SUMMARY = "Introspection bindings for Workrave"
DESCRIPTION = "This package contains typelib files needed for developing plugins for \
Workrave."
LICENSE = "GPL-3.0-only"

PV = "1.10.50"

RPM_NAME = "typelib-1_0-Workrave-1_0-1.10.50-2.2.aarch64.rpm"
RPM_HASH = "8907f3d400bca1217b6c310c4501762007fb6401f29e74adb1ebf1d4955dd7422e8a6f2e41808fdba915263a0415cfa0924d57616606ef1414c066e963fd47ad"

RPROVIDES:${PN} += "typelib(Workrave) \
typelib-1_0-Workrave-1_0 \
typelib-1_0-Workrave-1_0(aarch-64)"

RDEPENDS:${PN} += "libworkrave-private-1.0.so.0()(64bit) \
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
typelib(xlib) \
workrave"

inherit rpm
