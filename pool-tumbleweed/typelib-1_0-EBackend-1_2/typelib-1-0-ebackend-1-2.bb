SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "typelib-1_0-EBackend-1_2-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "b00b1550f998e08d0ea4f4695e6ee2e2db0b04b327ec176027cf8f794210105e3893f2044d09279637a0b240635a6013e8bdf083cde44238d96d0ca4672e7dbb"

RPROVIDES:${PN} += "typelib(EBackend) \
typelib-1_0-EBackend-1_2 \
typelib-1_0-EBackend-1_2(aarch-64)"

RDEPENDS:${PN} += "libcamel-1.2.so.64()(64bit) \
libebackend-1.2.so.11()(64bit) \
libedataserver-1.2.so.27()(64bit) \
typelib(Camel) \
typelib(EDataServer) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(Json) \
typelib(Soup) \
typelib(libxml2)"

inherit rpm
