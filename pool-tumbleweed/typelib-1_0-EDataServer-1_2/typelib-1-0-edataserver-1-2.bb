SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for the \
libedataserver library."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "typelib-1_0-EDataServer-1_2-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "55ad280c57657818bc2d3a8396cb9aa3d4fec78f19b261fc092aff94ec06cd2a41554dc1ba4f73e4f9c3bae4ee0bd18ddbb018ec51f68cdd3c3940ae4242916f"

RPROVIDES:${PN} += "typelib(EDataServer) \
typelib-1_0-EDataServer-1_2 \
typelib-1_0-EDataServer-1_2(aarch-64)"

RDEPENDS:${PN} += "libcamel-1.2.so.64()(64bit) \
libedataserver-1.2.so.27()(64bit) \
typelib(Camel) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(Json) \
typelib(Soup) \
typelib(libxml2)"

inherit rpm
