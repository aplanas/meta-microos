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

RPM_NAME = "typelib-1_0-GeocodeGlib-1_0-3.26.4-1.4.aarch64.rpm"
RPM_HASH = "21b129f9890d4f6b27f083bae12318553e8f6498dc75f0051f42c0c1403b15f753bc12a23f0d17766a45489ccf5e024822208704bfb77b1020c32b599661acfd"

RPROVIDES:${PN} += "typelib(GeocodeGlib) \
typelib-1_0-GeocodeGlib-1_0 \
typelib-1_0-GeocodeGlib-1_0(aarch-64)"

RDEPENDS:${PN} += "libgeocode-glib.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(Json) \
typelib(Soup)"

inherit rpm
