SUMMARY = "Clipboard management system for GNOME"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface."
LICENSE = "BSD-2-Clause"

PV = "44.1"

RPM_NAME = "gpaste-44.1-1.1.aarch64.rpm"
RPM_HASH = "7f47e903ea9e658793ef5f6fc958bcb7f23dcaa1f8bf7ba3fd7f89f6f12634d55a28e189f2c12d8e87d72559f6fc64aca497be70d4bf070f4bbda8c6db0db4f6"

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
