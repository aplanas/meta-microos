SUMMARY = "A portal frontend service for Flatpak"
DESCRIPTION = "A portal frontend service for Flatpak and possibly other desktop containment frameworks. \
 \
xdg-desktop-portal works by exposing a series of D-Bus interfaces known as portals under \
a well-known name (org.freedesktop.portal.Desktop) and object path (/org/freedesktop/portal/desktop). \
 \
The portal interfaces include APIs for file access, opening URIs, printing and others."
LICENSE = "LGPL-2.1-or-later"

PV = "1.16.0"

RPM_NAME = "xdg-desktop-portal-1.16.0-1.3.aarch64.rpm"
RPM_HASH = "25d75899b25adabd4d40ad5b7c830db7a68b9fa6781cf6ac4a0a82a83820a91a04e2af6046b0f9ad2ce51fd999b3e24196623e9822cddfda8a52f88a3931917b"

RPROVIDES:${PN} += "xdg-desktop-portal"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/fusermount3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.3 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libpipewire-0.3.so.0 \
libsystemd.so.0"

inherit rpm
