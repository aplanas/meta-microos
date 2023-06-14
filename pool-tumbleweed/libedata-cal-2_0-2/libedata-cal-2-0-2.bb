SUMMARY = "Evolution Data Server's Calendar Backend Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library for calendar backends."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "libedata-cal-2_0-2-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "09c8b979facfefb30a7065168bec208a0b2b6b09b291ceebd2698f4deb4ea31f4fe025c51a1230840088701ac4dabf4e2d1bb490c9735420f81021e6a9999557"

RPROVIDES:${PN} += "libedata-cal-2-0-2 \
libedata-cal-2.0.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.64 \
libebackend-1.2.so.11 \
libecal-2.0.so.2 \
libedataserver-1.2.so.27 \
libedbus-private.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libical-glib.so.3 \
libsoup-3.0.so.0 \
libsqlite3.so.0"

inherit rpm
