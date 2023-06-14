SUMMARY = "A backend implementation for xdg-desktop-portal"
DESCRIPTION = "A backend implementation for xdg-desktop-portal for the GNOME \
desktop environment."
LICENSE = "LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "xdg-desktop-portal-gnome-44.1-1.1.aarch64.rpm"
RPM_HASH = "a7665efc31b406131c6c9c1584bddbc950915e810c95ed685e7101231fa17e374de296a01b59087556a20ebe09720c1c154aff1c7aa9c684fc2c99e77acde443"

RPROVIDES:${PN} += "xdg-desktop-portal-gnome"

RDEPENDS:${PN} += "/bin/sh \
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
