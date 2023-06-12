SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "typelib-1_0-ECal-2_0-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "5cd53c1bd01fc5b69e28f855c2371e4bb625ad124bd4335c1c5a223894c428f5d8565a375e2ec7625289a33003ce347237998ccd4c630e204ee28530bf9fd6b1"

RPROVIDES:${PN} += "typelib(ECal) \
typelib-1_0-ECal-2_0 \
typelib-1_0-ECal-2_0(aarch-64)"
RDEPENDS:${PN} += "libecal-2.0.so.2()(64bit) \
typelib(Camel) \
typelib(EDataServer) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(ICalGLib) \
typelib(Json) \
typelib(Soup) \
typelib(libxml2)"

inherit rpm
