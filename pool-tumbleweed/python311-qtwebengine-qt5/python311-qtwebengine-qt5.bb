SUMMARY = "Python bindings for the Qt5 WebEngine framework"
DESCRIPTION = "PyQtWebEngine is a set of Python bindings for the Qt5 WebEngine \
framework. The framework provides the ability to embed web \
content in applications."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python311-qtwebengine-qt5-5.15.6-1.8.aarch64.rpm"
RPM_HASH = "b98d243e3125202fcb6fda4871628b8ab7e05152127a85cb020b54991541af69e91728403ec13835ece9e660f69e3646d0d52bde030092a412d56d448f7292cb"

RPROVIDES:${PN} += "python3-PyQtWebEngine \
python3-qtwebengine-qt5 \
python3.11dist-pyqtwebengine \
python311-PyQtWebEngine \
python311-qtwebengine-qt5 \
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
python311-qt5 \
python311-qt5-sip"

inherit rpm
