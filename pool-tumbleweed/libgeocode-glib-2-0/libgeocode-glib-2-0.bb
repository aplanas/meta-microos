SUMMARY = "Convenience library for the Yahoo! Place Finder APIs"
DESCRIPTION = "The geocode-glib library is a convenience library for the Yahoo! Place \
Finder APIs, as described at http://developer.yahoo.com/geo/placefinder/ \
 \
The Place Finder web service allows to do geocoding (finding longitude \
and latitude from an address), and reverse geocoding (finding an address \
from coordinates)."
LICENSE = "LGPL-2.0-or-later"

PV = "3.26.4"

RPM_NAME = "libgeocode-glib-2-0-3.26.4-1.4.aarch64.rpm"
RPM_HASH = "f489b62bb3feca944ac02e79f1b1107fd159fedb2cfee3c9f370098fed723b19c5e5cd3edfb766a8e548e1c1d45e47083b296979068feded751984c2a0cd2866"

RPROVIDES:${PN} += "libgeocode-glib-2-0 \
libgeocode-glib-2-0(aarch-64) \
libgeocode-glib-2.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
geocode-glib \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libsoup-3.0.so.0()(64bit)"

inherit rpm
