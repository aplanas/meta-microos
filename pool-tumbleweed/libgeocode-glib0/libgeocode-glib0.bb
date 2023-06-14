SUMMARY = "Convenience library for the Yahoo! Place Finder APIs"
DESCRIPTION = "The geocode-glib library is a convenience library for the Yahoo! Place \
Finder APIs, as described at http://developer.yahoo.com/geo/placefinder/ \
 \
The Place Finder web service allows to do geocoding (finding longitude \
and latitude from an address), and reverse geocoding (finding an address \
from coordinates)."
LICENSE = "LGPL-2.0-or-later"

PV = "3.26.4"

RPM_NAME = "libgeocode-glib0-3.26.4-1.4.aarch64.rpm"
RPM_HASH = "c78f98aec2ce7f869e9935c5373a5adb031e25ec5834e9a871658382937b7b2eb7768a9fb8a7e009bc2301f9f08832a20c1d9c83c6c37e9df51ca479181582be"

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
