SUMMARY = "Qt 6 Location library"
DESCRIPTION = "The Qt 6 Location library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Location6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "4e0f4a34030e01339fdf9b7de4e6a60888602aadabed6a14ddcacc20a3d5a2299eb300f81f49f9d78e3e80ca1c9d9f94040634382943a9953aa30c3e11572e02"

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
