SUMMARY = "Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "libedataserverui-1_2-4-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "884b0bad15081743ba1ffd30d363840a71b905a8aedeecba490df854460e389d9b51a11534aa0eddbb85ff5dffc103286a0cc6427cc4ffada96918617cb851a7"

RPROVIDES:${PN} += "libedataserverui-1-2-4 \
libedataserverui-1.2.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcamel-1.2.so.64 \
libecal-2.0.so.2 \
libedataserver-1.2.so.27 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libical-glib.so.3 \
libnspr4.so \
libnss3.so \
libpango-1.0.so.0 \
libsmime3.so \
libsoup-3.0.so.0 \
libwebkit2gtk-4.1.so.0"

inherit rpm
