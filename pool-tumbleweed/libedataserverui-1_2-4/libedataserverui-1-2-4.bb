SUMMARY = "Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "libedataserverui-1_2-4-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "884b0bad15081743ba1ffd30d363840a71b905a8aedeecba490df854460e389d9b51a11534aa0eddbb85ff5dffc103286a0cc6427cc4ffada96918617cb851a7"

RPROVIDES:${PN} += "libedataserverui-1.2.so.4()(64bit) \
libedataserverui-1_2-4 \
libedataserverui-1_2-4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libcamel-1.2.so.64()(64bit) \
libecal-2.0.so.2()(64bit) \
libedataserver-1.2.so.27()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libical-glib.so.3()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libnss3.so(NSS_3.2)(64bit) \
libnss3.so(NSS_3.3)(64bit) \
libnss3.so(NSS_3.7)(64bit) \
libnss3.so(NSS_3.9.2)(64bit) \
libpango-1.0.so.0()(64bit) \
libsmime3.so()(64bit) \
libsmime3.so(NSS_3.4)(64bit) \
libsoup-3.0.so.0()(64bit) \
libwebkit2gtk-4.1.so.0()(64bit)"

inherit rpm
