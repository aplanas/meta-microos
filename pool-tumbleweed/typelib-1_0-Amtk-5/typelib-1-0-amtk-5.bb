SUMMARY = "GObject Introspection Bindings for AMTK"
DESCRIPTION = "“Actions, Menus and Toolbars Kit” or just AMTK is a basic \
GtkUIManager replacement based on GAction, suitable for \
both a traditional UI or a modern UI with a GtkHeaderBar. \
 \
This package provides the GObject Introspection Bindings for AMTK."
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.1"

RPM_NAME = "typelib-1_0-Amtk-5-5.6.1-1.1.aarch64.rpm"
RPM_HASH = "f47345e333bf3c061593f3d4a0ac5c7087a7f5ec31d17f8184fbb34a0b28a66240dec0b9587b08c7a34fcba421d0cc7c5b3506266f868e2c9cc5f8d788778854"

RPROVIDES:${PN} += "typelib(Amtk) \
typelib-1_0-Amtk-5 \
typelib-1_0-Amtk-5(aarch-64)"
RDEPENDS:${PN} += "libamtk-5.so.0()(64bit) \
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
