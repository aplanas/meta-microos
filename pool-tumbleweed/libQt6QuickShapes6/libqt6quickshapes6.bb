SUMMARY = "Qt 6 QuickShapes library"
DESCRIPTION = "The Qt 6 QuickShapes library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickShapes6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "83e3156c620a7c8144be929d4c3dd5ae872fd56cedb97ff602b038efaee7b07063479de5a30a96ae03ec794cfb88e13e43a147ac53024a71fe947b5f4556b40b"

RPROVIDES:${PN} += "libQt6QuickShapes.so.6 \
libQt6QuickShapes6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
