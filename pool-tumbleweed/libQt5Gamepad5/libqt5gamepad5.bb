SUMMARY = "Qt 5 Gamepad Library"
DESCRIPTION = "Qt Gamepad is an add-on library that enables Qt applications to \
support the use of gamepad hardware. The module provides both QML and \
C++ interfaces."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5Gamepad5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "bfb807a7938695dc8edbab78306ac9a98ef13e707790b291a3b71476ad17d38d563ee27fc456756f06cd5828320386053922a2704138fc268d4ca2255f2ecad3"

RPROVIDES:${PN} += "libQt5Gamepad.so.5()(64bit) \
libQt5Gamepad.so.5(Qt_5)(64bit) \
libQt5Gamepad5 \
libQt5Gamepad5(aarch-64) \
libevdevgamepad.so()(64bit) \
libsdl2gamepad.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core5 \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
