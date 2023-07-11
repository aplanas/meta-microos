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

RPM_NAME = "typelib-1_0-GeocodeGlib-2_0-3.26.4-1.5.aarch64.rpm"
RPM_HASH = "6c47d41eb8c96730b20d1be3defee8e50eeb93d06006e74a7577076e87b152cbc80a8f1b38c1b90b15873a2049aee3b19bb95168ba9c729cf78cc88288e3eed2"

RPROVIDES:${PN} += "typelib-1-0-GeocodeGlib-2-0 \
typelib-GeocodeGlib"

RDEPENDS:${PN} += "libgeocode-glib-2.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Json \
typelib-Soup"

inherit rpm
