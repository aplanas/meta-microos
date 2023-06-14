SUMMARY = "Utilities to configure the Cinnamon desktop"
DESCRIPTION = "This package contains configuration applets for the Cinnamon \
desktop, allowing to set accessibility configuration, desktop \
fonts, keyboard and mouse properties, sound setup, desktop theme \
and background, user interface properties, screen resolution, and \
other Cinnamon parameters."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later & MIT"

PV = "5.8.0"

RPM_NAME = "cinnamon-control-center-5.8.0-1.1.aarch64.rpm"
RPM_HASH = "4ef01ab044db1da5de96b399e48adc929a7eb48dfbd5c3bb22bddec3dc2583d3d794d0352960d50a37cac92e9dc82fa12eb877e1ef461db684302acf6c0970a8"

RPROVIDES:${PN} += "cinnamon-control-center"

RDEPENDS:${PN} += "accountsservice \
adwaita-icon-theme \
cinnamon-control-center-common \
cinnamon-settings-daemon \
desktop-data \
gnome-online-accounts \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcinnamon-control-center.so.1 \
libcinnamon-menu-3.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnotify.so.4 \
libpango-1.0.so.0 \
polkit-gnome"

inherit rpm
