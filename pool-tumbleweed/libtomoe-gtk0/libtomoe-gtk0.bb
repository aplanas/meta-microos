SUMMARY = "TOMOE GTK+ library"
DESCRIPTION = "TOMOE GTK+ library"
LICENSE = "LGPL-2.1+"

PV = "0.6.0"

RPM_NAME = "libtomoe-gtk0-0.6.0-44.24.aarch64.rpm"
RPM_HASH = "bad3f53ea4e8e77aaaea8769fc462381611bff5fed814db5a00afa55f7faaa0efb951262004742a2722cd5e4374c3ef7afc3af7b2e6ba02590d359d056416322"

RPROVIDES:${PN} += "libtomoe-gtk.so.0 \
libtomoe-gtk0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libtomoe.so.0 \
tomoe-gtk"

inherit rpm
