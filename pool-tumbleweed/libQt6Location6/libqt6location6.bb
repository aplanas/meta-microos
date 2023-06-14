SUMMARY = "Qt 6 Location library"
DESCRIPTION = "The Qt 6 Location library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Location6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "e4d02ac5ed6a155f990081eb306f8ffea16016ff082bb514d1db1dc562293bebae859dbdc62bc4f6565337b787dd3f6220b83a1f6a27c4c89d9e1e72f1d2a6fd"

RPROVIDES:${PN} += "libQt6Location.so.6 \
libQt6Location6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Positioning.so.6 \
libQt6PositioningQuick.so.6 \
libQt6Qml.so.6 \
libQt6QmlModels.so.6 \
libQt6Quick.so.6 \
libQt6QuickShapes.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
