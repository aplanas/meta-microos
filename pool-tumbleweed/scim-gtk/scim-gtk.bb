SUMMARY = "SCIM im module for gtk2"
DESCRIPTION = "This package contains SCIM im module for gtk2"
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.18"

RPM_NAME = "scim-gtk-1.4.18-5.11.aarch64.rpm"
RPM_HASH = "65bccbd321305b2816277166a1cd13ece92c6dc85e225c7b23c0faf79afc314908e4704430d315329460cc2f0db5cce32ac7170a7b03ffae707a8e8a119dde5e"

RPROVIDES:${PN} += "scim-gtk"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
scim"

inherit rpm
