SUMMARY = "Development files for geocode-glib, a library for the Yahoo Place Finder APIs"
DESCRIPTION = "The geocode-glib library is a convenience library for the Yahoo! Place \
Finder APIs, as described at http://developer.yahoo.com/geo/placefinder/ \
 \
The Place Finder web service allows to do geocoding (finding longitude \
and latitude from an address), and reverse geocoding (finding an address \
from coordinates). \
 \
This package contains development files needed to develop with the \
geocode-glib library."
LICENSE = "LGPL-2.0-or-later"

PV = "3.26.4"

RPM_NAME = "geocode-glib-soup2-devel-3.26.4-1.4.aarch64.rpm"
RPM_HASH = "23252e820950b39fcb5644911e44f163c60e77a3dacd949ee9c37f51afb897b4fceabeff217e33fac17651554883020ac57862d96b0eb24d7774c9806f419bfb"

RPROVIDES:${PN} += "geocode-glib-soup2-devel \
geocode-glib-soup2-devel(aarch-64) \
pkgconfig(geocode-glib-1.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgeocode-glib0 \
pkgconfig(gio-2.0) \
typelib-1_0-GeocodeGlib-1_0"

inherit rpm
