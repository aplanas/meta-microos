SUMMARY = "Python bindings for the Qt5 WebEngine framework"
DESCRIPTION = "PyQtWebEngine is a set of Python bindings for the Qt5 WebEngine \
framework. The framework provides the ability to embed web \
content in applications."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python310-qtwebengine-qt5-5.15.6-1.8.aarch64.rpm"
RPM_HASH = "b45604e78197e562a9211f4129894e0f288bc0bc34e189c5f074c75d264df7308b507014ae77d82f1d0494b121536b1d880a336c5eb7408f48ffa06b19150b4f"

RPROVIDES:${PN} += "python3.10dist-pyqtwebengine \
python310-PyQtWebEngine \
python310-qtwebengine-qt5 \
python3dist-pyqtwebengine"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5WebEngine.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python310-qt5 \
python310-qt5-sip"

inherit rpm
