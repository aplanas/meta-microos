SUMMARY = "Introspection bindings for AppStream"
DESCRIPTION = "GObject introspection bindings for interfaces provided by AppStream."
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.1"

RPM_NAME = "typelib-1_0-AppStream-1.0-0.16.1-3.1.aarch64.rpm"
RPM_HASH = "120223259f70d4cc67a780cf8a671afa73941f036c5e44dea4974aa8edcba510897010ae581cd6751a81b9e2887c36762979e5468e8d7015400139f62e35da78"

RPROVIDES:${PN} += "typelib(AppStream) \
typelib-1_0-AppStream-1.0 \
typelib-1_0-AppStream-1.0(aarch-64)"

RDEPENDS:${PN} += "libappstream.so.4()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
