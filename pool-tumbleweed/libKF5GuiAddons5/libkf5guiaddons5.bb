SUMMARY = "Utilities for graphical user interfaces"
DESCRIPTION = "The KDE GUI addons provide utilities for graphical user interfaces in the areas \
of colors, fonts, text, images, keyboard input."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5GuiAddons5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "8e99848d5893ab89636ab73f581104a5e1e785ed6eb304e5c88ef936c682dfa30c0f23c349146c966c3556f1d528bc8f9777db93bae48b6390c4cdbd1d888a20"

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
