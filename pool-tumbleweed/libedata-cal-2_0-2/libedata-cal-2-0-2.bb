SUMMARY = "Evolution Data Server's Calendar Backend Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library for calendar backends."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "libedata-cal-2_0-2-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "09c8b979facfefb30a7065168bec208a0b2b6b09b291ceebd2698f4deb4ea31f4fe025c51a1230840088701ac4dabf4e2d1bb490c9735420f81021e6a9999557"

RPROVIDES:${PN} += "libedata-cal-2.0.so.2()(64bit) \
libedata-cal-2_0-2 \
libedata-cal-2_0-2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcamel-1.2.so.64()(64bit) \
libebackend-1.2.so.11()(64bit) \
libecal-2.0.so.2()(64bit) \
libedataserver-1.2.so.27()(64bit) \
libedbus-private.so()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libical-glib.so.3()(64bit) \
libsoup-3.0.so.0()(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
