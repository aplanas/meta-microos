SUMMARY = "Qt 6 Lottie QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Lottie module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-lottie-imports-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "e9c7e81e9e9f1f53dc825a8e7bd2089ffff9144e2fb48d2b0a2ecb57dae3aa21b6ca2f5006265368a018d0208fd30aad3cf26629a10047d1b0dfc12a99cb9be9"

RPROVIDES:${PN} += "liblottieqtplugin.so \
qt6-lottie-imports"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Bodymovin.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
