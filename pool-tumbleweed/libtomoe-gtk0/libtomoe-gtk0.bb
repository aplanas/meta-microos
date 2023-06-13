SUMMARY = "TOMOE GTK+ library"
DESCRIPTION = "TOMOE GTK+ library"
LICENSE = "LGPL-2.1+"

PV = "0.6.0"

RPM_NAME = "libtomoe-gtk0-0.6.0-44.24.aarch64.rpm"
RPM_HASH = "bad3f53ea4e8e77aaaea8769fc462381611bff5fed814db5a00afa55f7faaa0efb951262004742a2722cd5e4374c3ef7afc3af7b2e6ba02590d359d056416322"

RPROVIDES:${PN} += "libtomoe-gtk.so.0()(64bit) \
libtomoe-gtk0 \
libtomoe-gtk0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libtomoe.so.0()(64bit) \
tomoe-gtk"

inherit rpm
