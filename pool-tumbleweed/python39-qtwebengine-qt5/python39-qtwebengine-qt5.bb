SUMMARY = "Python bindings for the Qt5 WebEngine framework"
DESCRIPTION = "PyQtWebEngine is a set of Python bindings for the Qt5 WebEngine \
framework. The framework provides the ability to embed web \
content in applications."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python39-qtwebengine-qt5-5.15.6-1.8.aarch64.rpm"
RPM_HASH = "ec0a7737ea0dc036a74a16a0a4576149e9d01980cd9a7e04dd2d069189ffd30a57e7698a03422cbd2ba8f655892c21a3b57755494d6401e7c4c3356daddc4535"

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
