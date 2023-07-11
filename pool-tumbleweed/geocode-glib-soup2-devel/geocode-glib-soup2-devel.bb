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

RPM_NAME = "geocode-glib-soup2-devel-3.26.4-1.5.aarch64.rpm"
RPM_HASH = "0cff3f2fd77897c97a5db88abbac53ecf46a28ea3cc8c1c70d2a5b777354cbb26356ba39dd5b24fe74b838a387ebf4be0f5a0d7302a67ac6e3b795926865cfd2"

RPROVIDES:${PN} += "geocode-glib-soup2-devel \
pkgconfig-geocode-glib-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgeocode-glib0 \
pkgconfig-gio-2.0 \
typelib-1-0-GeocodeGlib-1-0"

inherit rpm
