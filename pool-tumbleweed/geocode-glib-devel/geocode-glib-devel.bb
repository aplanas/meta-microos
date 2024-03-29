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

RPM_NAME = "geocode-glib-devel-3.26.4-1.5.aarch64.rpm"
RPM_HASH = "9a91cfd0547b2ebb7861a6835a538463229e28c74a604fc08f63888174a0c041ea031f8c8ad6edf6d61ec15e554465f35c23612a771fd21c815023315c006222"

RPROVIDES:${PN} += "geocode-glib-devel \
pkgconfig-geocode-glib-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgeocode-glib-2-0 \
pkgconfig-gio-2.0 \
typelib-1-0-GeocodeGlib-2-0"

inherit rpm
