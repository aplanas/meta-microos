SUMMARY = "Evolution Data Server's Address Book Backend Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library for address book backends."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "libedata-book-1_2-27-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "7e1889ee289aea181aba9c20202a5797ae44678fc65e6fed214aa3bf542073ce7adff34b7ae7a0925c51c1bd7bfdde88362f8a0097ed00f338a2fd6c64d44744"

RPROVIDES:${PN} += "libedata-book-1.2.so.27()(64bit) \
libedata-book-1_2-27 \
libedata-book-1_2-27(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libebackend-1.2.so.11()(64bit) \
libebook-contacts-1.2.so.4()(64bit) \
libedataserver-1.2.so.27()(64bit) \
libedbus-private.so()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsoup-3.0.so.0()(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
