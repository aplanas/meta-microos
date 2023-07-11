SUMMARY = "Evolution Data Server's Address Book Client Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library to access address books."
LICENSE = "LGPL-2.0-only"

PV = "3.48.4"

RPM_NAME = "libebook-1_2-21-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "0b963acad9538f3491124a345742204b6d7b4a6540ce2c8cd18a915292f630945a66ceea8ae8937155818157ea67f97516b9139a8ade9bb5c91a8a2a7b74d642"

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
