SUMMARY = "Tomoe Input Method Engine for SCIM"
DESCRIPTION = "Tomoe Input Method Engine for SCIM"
LICENSE = "GPL-2.0+"

PV = "0.6.0"

RPM_NAME = "scim-tomoe-0.6.0-42.15.aarch64.rpm"
RPM_HASH = "7678e90e7de4d54dc6ce05ec4d314628649bfa6313cce4241d5b73aec345864f02d670a623740a9f96e83ee295e1ee6d8cdc8bf878f5fa8b9983e81bed0f171e"

RPROVIDES:${PN} += "scim-tomoe \
scim-tomoe(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libscim-1.0.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libtomoe-gtk.so.0()(64bit)"

inherit rpm
