SUMMARY = "Evolution Data Server's Address Book Client Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library to access address books."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "libebook-contacts-1_2-4-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "76cf6c863d5db0967762fbffeb422dc3389c5362bfe36dbdcc11cd18d5006bb24f565be6ccacefb017c95c02b163f33b6bd0d714262280b523056cef2e619b10"

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
