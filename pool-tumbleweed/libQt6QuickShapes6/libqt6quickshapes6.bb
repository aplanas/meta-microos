SUMMARY = "Qt 6 QuickShapes library"
DESCRIPTION = "The Qt 6 QuickShapes library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6QuickShapes6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "cf6a9a797edc106aa7b9491d89b7fb14a09f73062a119f87631d9d957da61dc852492c7718d67aeca041ea36593bd1cf6247429d71a56ebc4c21f6065c10b5e4"

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
