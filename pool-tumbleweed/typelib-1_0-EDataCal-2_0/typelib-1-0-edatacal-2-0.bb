SUMMARY = "Introspection bindings for Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "typelib-1_0-EDataCal-2_0-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "ad7b65c83fd328abd251e57937acdec2cc24653e5bc9cd6a3864beb65d63b0bc4936ab9fdeb37f38ef89804d6a6ed8f042424c36010db914cd47b54792981e31"

RPROVIDES:${PN} += "typelib(EDataCal) \
typelib-1_0-EDataCal-2_0 \
typelib-1_0-EDataCal-2_0(aarch-64)"
RDEPENDS:${PN} += "libebackend-1.2.so.11()(64bit) \
libecal-2.0.so.2()(64bit) \
libedata-cal-2.0.so.2()(64bit) \
libedataserver-1.2.so.27()(64bit) \
typelib(Camel) \
typelib(EBackend) \
typelib(ECal) \
typelib(EDataServer) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(ICalGLib) \
typelib(Json) \
typelib(Soup) \
typelib(libxml2)"

inherit rpm
