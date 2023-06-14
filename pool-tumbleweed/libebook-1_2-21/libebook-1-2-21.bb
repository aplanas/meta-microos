SUMMARY = "Evolution Data Server's Address Book Client Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library to access address books."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "libebook-1_2-21-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "f2f746d93b35372253d917140e66ac3c9c95b85d27dc302c6d87b48699f75ed740ef48b86d905e92c7bbccf1a8f9d6e9d5e00d2b7b66cd7e264ee71f21ec7b1b"

RPROVIDES:${PN} += "libebook-1-2-21 \
libebook-1.2.so.21"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.64 \
libebook-contacts-1.2.so.4 \
libedata-book-1.2.so.27 \
libedataserver-1.2.so.27 \
libedbus-private.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnss3.so \
libsmime3.so \
libxml2.so.2"

inherit rpm
