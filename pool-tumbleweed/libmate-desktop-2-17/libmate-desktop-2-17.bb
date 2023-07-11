SUMMARY = "Library with common API for various MATE modules"
DESCRIPTION = "This package contains the library with common API for various \
MATE modules."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.26.1"

RPM_NAME = "libmate-desktop-2-17-1.26.1-1.2.aarch64.rpm"
RPM_HASH = "ae5e1a22fc3b451d0c9623618157a813058045c6d633c1001719b8d7db2648ff5cfc5f883eb3596287f64248c7aa6e91a2e5d25a7105978b8dcb08a04e851a55"

RPROVIDES:${PN} += "libmate-desktop-2-17 \
libmate-desktop-2.so.17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libdconf.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libstartup-notification-1.so.0 \
mate-desktop-gschemas"

inherit rpm
