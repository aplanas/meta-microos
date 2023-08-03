SUMMARY = "Qt 6 Location library"
DESCRIPTION = "The Qt 6 Location library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6Location6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "69803e9dbd5249d0c7d73cdea1e12079a57e39b18d6b672156a884e44a176e05081f8548d32b6a0108be1dd39fbc98354fcc4c92317a867346396fd4187fb184"

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
