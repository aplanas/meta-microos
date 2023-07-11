SUMMARY = "Convenience library for the Yahoo! Place Finder APIs"
DESCRIPTION = "The geocode-glib library is a convenience library for the Yahoo! Place \
Finder APIs, as described at http://developer.yahoo.com/geo/placefinder/ \
 \
The Place Finder web service allows to do geocoding (finding longitude \
and latitude from an address), and reverse geocoding (finding an address \
from coordinates)."
LICENSE = "LGPL-2.0-or-later"

PV = "3.26.4"

RPM_NAME = "libgeocode-glib0-3.26.4-1.5.aarch64.rpm"
RPM_HASH = "31b9a1f48a482de738ef808316d60594ef4e5d264f7a07393ba6b2440e7c42d5459993cde617d48e337ecc8226d293547e87d79e295ade28e1fc53a95de29add"

RPROVIDES:${PN} += "libgeocode-glib.so.0 \
libgeocode-glib0"

RDEPENDS:${PN} += "/sbin/ldconfig \
geocode-glib \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libsoup-2.4.so.1"

inherit rpm
