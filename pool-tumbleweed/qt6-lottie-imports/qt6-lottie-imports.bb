SUMMARY = "Qt 6 Lottie QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Lottie module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-lottie-imports-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a414e1e34bf52f5be57d0738cbff58eb5cd50a3d21b9e80b7624915b6b3a449c0d9a3023c642060fe299fec6060c5e5d3c61070afe6df7a8e784c81c15cdc431"

RPROVIDES:${PN} += "liblottieqtplugin.so \
qt6-lottie-imports \
qt6qmlimport-Qt.labs.lottieqt.1 \
qt6qmlimport-Qt.labs.lottieqt.2 \
qt6qmlimport-Qt.labs.lottieqt.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Bodymovin.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
