SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for the \
libedataserver library."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "typelib-1_0-EDataServerUI-1_2-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "dac8f1bace250a8cc938bc2e9e578dac1536ac806de58ba799f1a7fbe4840b70e4b1e6fc6b2d191d9ae669b1eb0fbce1b3e2de4c7f331d5857c2d5f1dce66738"

RPROVIDES:${PN} += "typelib(EDataServerUI) \
typelib-1_0-EDataServerUI-1_2 \
typelib-1_0-EDataServerUI-1_2(aarch-64)"

RDEPENDS:${PN} += "libcamel-1.2.so.64()(64bit) \
libecal-2.0.so.2()(64bit) \
libedataserver-1.2.so.27()(64bit) \
libedataserverui-1.2.so.4()(64bit) \
typelib(Atk) \
typelib(Camel) \
typelib(ECal) \
typelib(EDataServer) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(ICalGLib) \
typelib(Json) \
typelib(Pango) \
typelib(Soup) \
typelib(cairo) \
typelib(freetype2) \
typelib(libxml2) \
typelib(xlib)"

inherit rpm
