SUMMARY = "Qt 5 Gamepad Library"
DESCRIPTION = "Qt Gamepad is an add-on library that enables Qt applications to \
support the use of gamepad hardware. The module provides both QML and \
C++ interfaces."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5Gamepad5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "4a55e28612be469a48004f709ffef45a5b9c4b65ab5523a0d958e4addbcf17dcc362223ab06dbb261aa077024a4e8b6e141d58684a0ff94d165f1e4de6853c8f"

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
