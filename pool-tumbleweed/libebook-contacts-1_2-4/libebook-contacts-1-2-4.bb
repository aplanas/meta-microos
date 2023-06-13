SUMMARY = "Evolution Data Server's Address Book Client Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library to access address books."
LICENSE = "LGPL-2.0-only"

PV = "3.48.2"

RPM_NAME = "libebook-contacts-1_2-4-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "76cf6c863d5db0967762fbffeb422dc3389c5362bfe36dbdcc11cd18d5006bb24f565be6ccacefb017c95c02b163f33b6bd0d714262280b523056cef2e619b10"

RPROVIDES:${PN} += "libebook-contacts-1.2.so.4()(64bit) \
libebook-contacts-1_2-4 \
libebook-contacts-1_2-4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcamel-1.2.so.64()(64bit) \
libedataserver-1.2.so.27()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libphonenumber.so.8()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
