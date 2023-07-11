SUMMARY = "Python bindings for the Qt WebEngine framework"
DESCRIPTION = "PyQt6-WebEngine is a set of Python bindings for The Qt Company’s Qt WebEngine \
framework. The framework provides the ability to embed web content in \
applications and is based on the Chrome browser. The bindings sit on top of PyQt6 \
and are implemented as three separate modules corresponding to the different \
libraries that make up the framework."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-WebEngine-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "03fb524f044f66a102ac6c547da0c2fc848f2d03709d0253cba1795829d2e080583b1dc600d79de1fb632922e729546124ce5da92e6f3d3e27a616243e7e93ba"

RPROVIDES:${PN} += "python3-PyQt6-WebEngine \
python3-qtwebengine-qt6 \
python3.11dist-pyqt6-webengine \
python311-PyQt6-WebEngine \
python311-qtwebengine-qt6 \
python3dist-pyqt6-webengine"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineQuick.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python311-PyQt6"

inherit rpm
