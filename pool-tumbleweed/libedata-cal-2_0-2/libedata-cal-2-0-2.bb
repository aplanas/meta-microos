SUMMARY = "Evolution Data Server's Calendar Backend Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library for calendar backends."
LICENSE = "LGPL-2.0-only"

PV = "3.48.4"

RPM_NAME = "libedata-cal-2_0-2-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "b6bfdf2e2a098b05ac1385203f22ac07b476d3dcc0cc0af81c9e7ce642dad4cb6a106f5f8e8ab036743a3e66275abec9037931c826b9795bce5a845f7e0d6bb1"

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
