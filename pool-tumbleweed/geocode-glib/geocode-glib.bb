SUMMARY = "Convenience library for the Yahoo! Place Finder APIs"
DESCRIPTION = "The geocode-glib library is a convenience library for the Yahoo! Place \
Finder APIs, as described at http://developer.yahoo.com/geo/placefinder/ \
 \
The Place Finder web service allows to do geocoding (finding longitude \
and latitude from an address), and reverse geocoding (finding an address \
from coordinates)."
LICENSE = "LGPL-2.0-or-later"

PV = "3.26.4"

RPM_NAME = "geocode-glib-3.26.4-1.4.aarch64.rpm"
RPM_HASH = "da70d9fc7433f0e5cdea04f58095c8181fa75326133380c415c23df3c95342ae8f457fe6c20fe3a9f53c3c78e81ac7f64a98656d2e33483efec1f1a8d69d33e0"

RPROVIDES:${PN} += "geocode-glib \
geocode-glib(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
