SUMMARY = "Evolution Data Server's Calendar Client Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library to access calendars."
LICENSE = "LGPL-2.0-only"

PV = "3.48.4"

RPM_NAME = "libecal-2_0-2-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "99b49cf5ea0a3a75ebfd7bea12a78729fdf28576cea7a3c959fdbc2e6c7bcf97edfe5f0dec68ab5d4d17342692cffb6d46e12afef30ad11373b938490ab45b53"

RPROVIDES:${PN} += "libecal-2-0-2 \
libecal-2.0.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.64 \
libedataserver-1.2.so.27 \
libedbus-private.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libical-glib.so.3 \
libical.so.3"

inherit rpm
