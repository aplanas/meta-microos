SUMMARY = "Utilities to configure the Cinnamon desktop"
DESCRIPTION = "This package contains configuration applets for the Cinnamon \
desktop, allowing to set accessibility configuration, desktop \
fonts, keyboard and mouse properties, sound setup, desktop theme \
and background, user interface properties, screen resolution, and \
other Cinnamon parameters."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later & MIT"

PV = "5.6.1"

RPM_NAME = "cinnamon-control-center-5.6.1-1.3.aarch64.rpm"
RPM_HASH = "afa756b18215a927785da1aa5e07d2bb0b8f413465794824ea326c24829823e8d6f948fdf12cd3d42abd32fbb3a5cb86ac1cb7bca8f43aa363bf2789d4678e3f"

RPROVIDES:${PN} += "application() application(cinnamon-color-panel.desktop) application(cinnamon-display-panel.desktop) application(cinnamon-network-panel.desktop) application(cinnamon-wacom-panel.desktop) cinnamon-control-center cinnamon-control-center(aarch-64)"
RDEPENDS:${PN} += "accountsservice adwaita-icon-theme cinnamon-control-center-common cinnamon-settings-daemon desktop-data gnome-online-accounts ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcinnamon-control-center.so.1()(64bit) libcinnamon-menu-3.so.0()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libnotify.so.4()(64bit) libpango-1.0.so.0()(64bit) polkit-gnome"

inherit rpm
