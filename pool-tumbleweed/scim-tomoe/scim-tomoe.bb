SUMMARY = "Tomoe Input Method Engine for SCIM"
DESCRIPTION = "Tomoe Input Method Engine for SCIM"
LICENSE = "GPL-2.0+"

PV = "0.6.0"

RPM_NAME = "scim-tomoe-0.6.0-42.16.aarch64.rpm"
RPM_HASH = "2d7a02732c62a95e2aac5f1f836162e8165ff71a41ed3eb20f834415e37bac176ec05c3a361d947640c5af0e403e039ecf51bf6b3b780339cefad311a81f6619"

RPROVIDES:${PN} += "scim-tomoe"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libscim-1.0.so.8 \
libstdc++.so.6 \
libtomoe-gtk.so.0"

inherit rpm
