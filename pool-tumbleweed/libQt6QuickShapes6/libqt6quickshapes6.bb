SUMMARY = "Qt 6 QuickShapes library"
DESCRIPTION = "The Qt 6 QuickShapes library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickShapes6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "4a545a8f8c7777d9921235553f2737b5b6f7fc27ff3cfab08f8b2798bbf408abc90a87f453bf2443a3be93331682a8060446651bf89251b32e6aab68e7810737"

RPROVIDES:${PN} += "libQt6QuickShapes.so.6()(64bit) \
libQt6QuickShapes.so.6(Qt_6)(64bit) \
libQt6QuickShapes6 \
libQt6QuickShapes6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
