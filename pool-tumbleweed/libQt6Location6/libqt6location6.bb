SUMMARY = "Qt 6 Location library"
DESCRIPTION = "The Qt 6 Location library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Location6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "786990a8eb6fc38536e62b9465d46b294a6874a09734806a133e0d4ff44eb6736c4c6de487120142931abd251419b9363c8478d757b2d9065b9f18af93b51995"

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
