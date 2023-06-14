SUMMARY = "Qt 5 Quick Lottie Addon"
DESCRIPTION = "This package provides a QML module for Qt 5 which allows playing of BodyMovin \
files from QML."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtlottie-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "8ca9c78fe156f5e218d884d108bb5ab1b6eaa61474c1a2f4ce995dca17b9cea0b8d4dcdb10fc828219944608dcd1d5053d65361b9f618a08f0d56ca7e825b30f"

RPROVIDES:${PN} += "liblottieqtplugin.so \
libqt5-qtlottie \
qt5qmlimport-Qt.labs.lottieqt.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Bodymovin.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
