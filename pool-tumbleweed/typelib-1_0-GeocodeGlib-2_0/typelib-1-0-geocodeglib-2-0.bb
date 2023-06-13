SUMMARY = "Introspection bindings for geocode-glib"
DESCRIPTION = "The geocode-glib library is a convenience library for the Yahoo! Place \
Finder APIs, as described at http://developer.yahoo.com/geo/placefinder/ \
 \
The Place Finder web service allows to do geocoding (finding longitude \
and latitude from an address), and reverse geocoding (finding an address \
from coordinates). \
 \
This package provides the GObject Introspection bindings for the \
geocode-glib library."
LICENSE = "LGPL-2.0-or-later"

PV = "3.26.4"

RPM_NAME = "typelib-1_0-GeocodeGlib-2_0-3.26.4-1.4.aarch64.rpm"
RPM_HASH = "000aeaf24d6248b45ddf0254c55d7986720ce0f5ce6746c2a0cfe850bb056a35955adaab295620a80f40508b3b743dcfc22a07fdce43af4031c8acd9546dbac8"

RPROVIDES:${PN} += "typelib(GeocodeGlib) \
typelib-1_0-GeocodeGlib-2_0 \
typelib-1_0-GeocodeGlib-2_0(aarch-64)"

RDEPENDS:${PN} += "libgeocode-glib-2.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(Json) \
typelib(Soup)"

inherit rpm
