SUMMARY = "Tomoe Input Method Engine for SCIM"
DESCRIPTION = "Tomoe Input Method Engine for SCIM"
LICENSE = "GPL-2.0+"

PV = "0.6.0"

RPM_NAME = "scim-tomoe-0.6.0-42.15.aarch64.rpm"
RPM_HASH = "7678e90e7de4d54dc6ce05ec4d314628649bfa6313cce4241d5b73aec345864f02d670a623740a9f96e83ee295e1ee6d8cdc8bf878f5fa8b9983e81bed0f171e"

RPROVIDES:${PN} += "scim-tomoe"

RDEPENDS:${PN} += "/bin/sh \
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
