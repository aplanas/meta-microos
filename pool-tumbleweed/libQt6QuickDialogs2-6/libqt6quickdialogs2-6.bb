SUMMARY = "Qt 6 QuickDialogs2 library"
DESCRIPTION = "The Qt 6 QuickDialogs2 library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6QuickDialogs2-6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "64c574f5dfb2275a90d103d4fb9fd2c013f77ae7fb08a506b3fb371bbd560f3abe31c3fd6269ddcc1be2e287f48d39065ffdaf1c1f9027a212d4cc773f32fa5a"

RPROVIDES:${PN} += "libQt6QuickDialogs2-6 \
libQt6QuickDialogs2.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickDialogs2QuickImpl.so.6 \
libQt6QuickDialogs2Utils.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
