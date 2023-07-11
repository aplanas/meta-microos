SUMMARY = "Clipboard management system for GNOME"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "gpaste-43.2+6-2.2.aarch64.rpm"
RPM_HASH = "7b6b2569b35ea29652fd913041c16245e67dd2faf0ca574ee1e5c3f3da6d3ca87b923179dbe75f201a0db59c3459513454c1a33f97efd24dc083c0aa401b4028"

RPROVIDES:${PN} += "gpaste"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libadwaita-1.so.0 \
libc.so.6 \
libgcr-4.so.4 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpaste-2.so.0 \
libgpaste-gtk-3.so.0 \
libgpaste-gtk4.so.0 \
libgtk-3.so.0 \
libgtk-4.so.1"

inherit rpm
