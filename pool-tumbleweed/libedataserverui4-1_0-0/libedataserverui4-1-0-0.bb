SUMMARY = "Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "libedataserverui4-1_0-0-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "4da74efea0e68f9dce21fdb8abfbce3bde2c3b9f8db67c87570faf5e2b1d0b68668fa7903cdfddbdf2f3bd774c4cb319fafde8314cecd15dfda3dc1684ef344d"

RPROVIDES:${PN} += "libedataserverui4-1-0-0 \
libedataserverui4-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.64 \
libecal-2.0.so.2 \
libedataserver-1.2.so.27 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libical-glib.so.3 \
libnspr4.so \
libnss3.so \
libpango-1.0.so.0 \
libsmime3.so \
libsoup-3.0.so.0 \
libwebkitgtk-6.0.so.4"

inherit rpm
