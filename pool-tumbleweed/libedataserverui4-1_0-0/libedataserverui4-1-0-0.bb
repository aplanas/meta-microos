SUMMARY = "Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "libedataserverui4-1_0-0-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "4da74efea0e68f9dce21fdb8abfbce3bde2c3b9f8db67c87570faf5e2b1d0b68668fa7903cdfddbdf2f3bd774c4cb319fafde8314cecd15dfda3dc1684ef344d"

RPROVIDES:${PN} += "libedataserverui4-1.0.so.0()(64bit) \
libedataserverui4-1_0-0 \
libedataserverui4-1_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcamel-1.2.so.64()(64bit) \
libecal-2.0.so.2()(64bit) \
libedataserver-1.2.so.27()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libical-glib.so.3()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libpango-1.0.so.0()(64bit) \
libsmime3.so()(64bit) \
libsoup-3.0.so.0()(64bit) \
libwebkitgtk-6.0.so.4()(64bit)"

inherit rpm
