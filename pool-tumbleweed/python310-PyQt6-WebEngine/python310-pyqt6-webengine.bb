SUMMARY = "Python bindings for the Qt WebEngine framework"
DESCRIPTION = "PyQt6-WebEngine is a set of Python bindings for The Qt Company’s Qt WebEngine \
framework. The framework provides the ability to embed web content in \
applications and is based on the Chrome browser. The bindings sit on top of PyQt6 \
and are implemented as three separate modules corresponding to the different \
libraries that make up the framework."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-WebEngine-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "ab700bcf3108b5385292389079cc9fe37bb95ce91c888dde27c01eff18134260566d15ba7d790ddc61557bbe01c9bbfa819eb72c06e5d537267331d31e14ee83"

RPROVIDES:${PN} += "python3.10dist-pyqt6-webengine \
python310-PyQt6-WebEngine \
python310-qtwebengine-qt6 \
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
python310-PyQt6"

inherit rpm
