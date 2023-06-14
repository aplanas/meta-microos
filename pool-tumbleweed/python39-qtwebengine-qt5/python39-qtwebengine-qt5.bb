SUMMARY = "Python bindings for the Qt5 WebEngine framework"
DESCRIPTION = "PyQtWebEngine is a set of Python bindings for the Qt5 WebEngine \
framework. The framework provides the ability to embed web \
content in applications."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python39-qtwebengine-qt5-5.15.6-1.7.aarch64.rpm"
RPM_HASH = "694a4fc00f6eff17951373f2a653c956a746e62e3b42561342baaf6fbc30212d05cd3873550b201ab01308abcf5661ea1a1a23cc677aed813327f3fa49980987"

RPROVIDES:${PN} += "python3.9dist-pyqtwebengine \
python39-PyQtWebEngine \
python39-qtwebengine-qt5 \
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
python39-qt5 \
python39-qt5-sip"

inherit rpm
