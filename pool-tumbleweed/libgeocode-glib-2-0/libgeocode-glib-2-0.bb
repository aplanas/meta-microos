SUMMARY = "Convenience library for the Yahoo! Place Finder APIs"
DESCRIPTION = "The geocode-glib library is a convenience library for the Yahoo! Place \
Finder APIs, as described at http://developer.yahoo.com/geo/placefinder/ \
 \
The Place Finder web service allows to do geocoding (finding longitude \
and latitude from an address), and reverse geocoding (finding an address \
from coordinates)."
LICENSE = "LGPL-2.0-or-later"

PV = "3.26.4"

RPM_NAME = "libgeocode-glib-2-0-3.26.4-1.5.aarch64.rpm"
RPM_HASH = "5ec23d7a5e0fc427b20f1c53c154f38b2b24326f77f1312d7b287a37e7c4354d13aae516c214d198cf0db6b6da06b5a1d4834f38a08655aba181c98cd8a22592"

RPROVIDES:${PN} += "libgeocode-glib-2-0 \
libgeocode-glib-2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
geocode-glib \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libsoup-3.0.so.0"

inherit rpm
