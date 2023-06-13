SUMMARY = "Utilities for graphical user interfaces"
DESCRIPTION = "The KDE GUI addons provide utilities for graphical user interfaces in the areas \
of colors, fonts, text, images, keyboard input."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5GuiAddons5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "019341614a397cdd1a9bde660a2b2544213453271eb18554cb804af0f8734284193312f99a67c2690a84a693f5f25127ea6f915f85114e5cfbdfd5f6efa63986"

RPROVIDES:${PN} += "libKF5GuiAddons.so.5()(64bit) \
libKF5GuiAddons5 \
libKF5GuiAddons5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui5 \
libQt5WaylandClient.so.5()(64bit) \
libQt5WaylandClient.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwayland-client.so.0()(64bit)"

inherit rpm
