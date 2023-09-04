SUMMARY = "A backend implementation for xdg-desktop-portal"
DESCRIPTION = "A backend implementation for xdg-desktop-portal for the GNOME \
desktop environment."
LICENSE = "LGPL-2.1-or-later"

PV = "44.2"

RPM_NAME = "xdg-desktop-portal-gnome-44.2-1.1.aarch64.rpm"
RPM_HASH = "8d8db5528cbcdd952396a15d17b2a8a0968ab143627473d75e5da8ccc739c46351359c223404c10e5c7d354bdda6798080f13436d08ef305f4261d0b33ed1342"

RPROVIDES:${PN} += "xdg-desktop-portal-gnome"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-bg-4.so.2 \
libgnome-desktop-4.so.2 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libwayland-client.so.0 \
xdg-desktop-portal"

inherit rpm
