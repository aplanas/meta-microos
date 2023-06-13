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

RPROVIDES:${PN} += "application() \
application(cinnamon-color-panel.desktop) \
application(cinnamon-display-panel.desktop) \
application(cinnamon-network-panel.desktop) \
application(cinnamon-wacom-panel.desktop) \
cinnamon-control-center \
cinnamon-control-center(aarch-64)"

RDEPENDS:${PN} += "accountsservice \
adwaita-icon-theme \
cinnamon-control-center-common \
cinnamon-settings-daemon \
desktop-data \
gnome-online-accounts \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcinnamon-control-center.so.1()(64bit) \
libcinnamon-menu-3.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libnotify.so.4()(64bit) \
libpango-1.0.so.0()(64bit) \
polkit-gnome"

inherit rpm
