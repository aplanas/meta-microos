SUMMARY = "Qt 5 Gamepad Library"
DESCRIPTION = "Qt Gamepad is an add-on library that enables Qt applications to \
support the use of gamepad hardware. The module provides both QML and \
C++ interfaces."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5Gamepad5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "bfb807a7938695dc8edbab78306ac9a98ef13e707790b291a3b71476ad17d38d563ee27fc456756f06cd5828320386053922a2704138fc268d4ca2255f2ecad3"

RPROVIDES:${PN} += "libQt5Gamepad.so.5 \
libQt5Gamepad5 \
libevdevgamepad.so \
libsdl2gamepad.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libSDL2-2.0.so.0 \
libc.so.6 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
