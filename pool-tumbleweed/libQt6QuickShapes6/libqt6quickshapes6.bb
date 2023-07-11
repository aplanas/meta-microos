SUMMARY = "Qt 6 QuickShapes library"
DESCRIPTION = "The Qt 6 QuickShapes library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickShapes6-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "1834b59de5d39b9385d0ae9ea890726c1b3e939e2d4b022fab0bf7901bf4308702706b7e09d65fe5a5f51da69c3c308e491943c3c4b45d4e5aee2e5376ee94cd"

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
