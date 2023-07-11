SUMMARY = "Evolution Data Server's Address Book Client Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library to access address books."
LICENSE = "LGPL-2.0-only"

PV = "3.48.4"

RPM_NAME = "libebook-contacts-1_2-4-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "d051db9f407e8bb34c014b96fa0320ee2ac2deca8a8adf222fc8f06a1f55426cc91c71f5b54653bb2252c65d7ee63b4dfd7ba2db4c06b7fb7dc08e576ba745cb"

RPROVIDES:${PN} += "libebook-contacts-1-2-4 \
libebook-contacts-1.2.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.64 \
libedataserver-1.2.so.27 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libphonenumber.so.8 \
libstdc++.so.6"

inherit rpm
