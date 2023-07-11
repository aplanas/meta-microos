SUMMARY = "A backend implementation for xdg-desktop-portal"
DESCRIPTION = "A backend implementation for xdg-desktop-portal for the GNOME \
desktop environment."
LICENSE = "LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "xdg-desktop-portal-gnome-44.1-1.2.aarch64.rpm"
RPM_HASH = "0f789e7aa88e11f53219b0928e59fef0c6af6b31a2adfb3503ab67afe409c021aa54e465fe87ad843ed14d6aa0555be6ef1aaf2a88d200231a9e07b3ae60e531"

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
