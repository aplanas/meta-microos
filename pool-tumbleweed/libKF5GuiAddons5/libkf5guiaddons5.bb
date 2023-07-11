SUMMARY = "Utilities for graphical user interfaces"
DESCRIPTION = "The KDE GUI addons provide utilities for graphical user interfaces in the areas \
of colors, fonts, text, images, keyboard input."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5GuiAddons5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "71a7e6209f5425c646de6164f6dc2c6cd7a85772923ac7ce7b04615aa25cf1a193eea2aab93db3eade9cae263e87fd9a977589ee6033efd60e4c2c8301e3a916"

RPROVIDES:${PN} += "libKF5GuiAddons.so.5 \
libKF5GuiAddons5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5WaylandClient.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libwayland-client.so.0"

inherit rpm
