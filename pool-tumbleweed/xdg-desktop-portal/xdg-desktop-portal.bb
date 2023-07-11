SUMMARY = "A portal frontend service for Flatpak"
DESCRIPTION = "A portal frontend service for Flatpak and possibly other desktop containment frameworks. \
 \
xdg-desktop-portal works by exposing a series of D-Bus interfaces known as portals under \
a well-known name (org.freedesktop.portal.Desktop) and object path (/org/freedesktop/portal/desktop). \
 \
The portal interfaces include APIs for file access, opening URIs, printing and others."
LICENSE = "LGPL-2.1-or-later"

PV = "1.16.0"

RPM_NAME = "xdg-desktop-portal-1.16.0-2.1.aarch64.rpm"
RPM_HASH = "cf49cbf2ddc08981f85e55556d8875aa86938042fc22859babaa08b4d1f7dfabfc279374c31d357b7094342a22b0c8fe8ffabdb0529615fd1bcfc31a0b93f242"

RPROVIDES:${PN} += "xdg-desktop-portal"

RDEPENDS:${PN} += "/usr/bin/fusermount3 \
/usr/bin/sh \
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
