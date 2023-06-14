SUMMARY = "Qt 6 QuickControls2 library"
DESCRIPTION = "The Qt 6 QuickControls2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickControls2-6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "3db7dd5a25ff160a1e9a4e8063c975bc204d449cdd95da7888e9eb3d982ecd09d7fd2f46d055929f79d10bb03def40cc4084712390dcefbc7b924a91eaf4587d"

RPROVIDES:${PN} += "libQt6QuickControls2-6 \
libQt6QuickControls2.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickTemplates2.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
