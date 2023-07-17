SUMMARY = "Utilities for graphical user interfaces"
DESCRIPTION = "The KDE GUI addons provide utilities for graphical user interfaces in the areas \
of colors, fonts, text, images, keyboard input."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5GuiAddons5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "ae6bee82acaddc298b82e3928dbc0ac167a4dfb08023e209d5e5eeef4c96fd5fa66acfd76e90d92291bf41d148d96bc1dce93fa23970a12e47b6eead2a89183e"

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
