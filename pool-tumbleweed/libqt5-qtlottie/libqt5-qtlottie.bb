SUMMARY = "Qt 5 Quick Lottie Addon"
DESCRIPTION = "This package provides a QML module for Qt 5 which allows playing of BodyMovin \
files from QML."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtlottie-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "d1902f4359268b994b709de4e4a062998d9b1248581646f9c276b8a1f90c7cf6a1636e46662bb77975c9b3d9a096da86041f7ac08e6c3c84c486b71d11dc495f"

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
