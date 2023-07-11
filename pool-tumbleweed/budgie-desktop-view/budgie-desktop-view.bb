SUMMARY = "Official Budgie Desktop icons application / implementation"
DESCRIPTION = "Budgie Desktop View is the official Budgie desktop icons application / implementation"
LICENSE = "Apache-2.0"

PV = "1.2.1+0"

RPM_NAME = "budgie-desktop-view-1.2.1+0-1.4.aarch64.rpm"
RPM_HASH = "0f8def41b6d7a6fbc92491a8d5aeb48d561619561eade8c5fb5bc0cb5b87582bbaa81292e58a160d2a49abd4e6fcc2cafe7bf5951919ef8805a911744a27da6c"

RPROVIDES:${PN} += "budgie-desktop-view"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
