SUMMARY = "Evolution Data Server's Address Book Backend Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library for address book backends."
LICENSE = "LGPL-2.0-only"

PV = "3.48.4"

RPM_NAME = "libedata-book-1_2-27-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "93ebe6659e485e650b8cd16aa20364d7897235d0090d3acf1aa796a4f88458846a68b45f84f744e22551270e8f41d6232e5507a6d49fd8bc8f04b6488d9ed2fd"

RPROVIDES:${PN} += "libedata-book-1-2-27 \
libedata-book-1.2.so.27"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libebackend-1.2.so.11 \
libebook-contacts-1.2.so.4 \
libedataserver-1.2.so.27 \
libedbus-private.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsoup-3.0.so.0 \
libsqlite3.so.0"

inherit rpm
