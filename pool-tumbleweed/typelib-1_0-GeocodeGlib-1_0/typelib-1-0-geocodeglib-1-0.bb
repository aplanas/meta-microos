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

RPM_NAME = "typelib-1_0-GeocodeGlib-1_0-3.26.4-1.5.aarch64.rpm"
RPM_HASH = "0e992792074fe304e3fafc5f755af75b0db84e24ec95254d2e28f5a3a650141164f559cecd42904c6fbe2c2f3a699676ec8c7e4b5caae5b74835bafae6cd8ce7"

RPROVIDES:${PN} += "typelib-1-0-GeocodeGlib-1-0 \
typelib-GeocodeGlib"

RDEPENDS:${PN} += "libgeocode-glib.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Json \
typelib-Soup"

inherit rpm
