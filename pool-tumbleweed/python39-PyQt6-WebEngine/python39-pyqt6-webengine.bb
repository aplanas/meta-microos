SUMMARY = "Python bindings for the Qt WebEngine framework"
DESCRIPTION = "PyQt6-WebEngine is a set of Python bindings for The Qt Company’s Qt WebEngine \
framework. The framework provides the ability to embed web content in \
applications and is based on the Chrome browser. The bindings sit on top of PyQt6 \
and are implemented as three separate modules corresponding to the different \
libraries that make up the framework."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-WebEngine-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "f92435ce924dd660aefb224e92df9dc50a702aaebadf7969c7ad317a33367275aad3b6ad4bb3146f97d42a503702054eed703fb5383db77f7dee9428da48a576"

RPROVIDES:${PN} += "python3.9dist-pyqt6-webengine \
python39-PyQt6-WebEngine \
python39-qtwebengine-qt6 \
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
python39-PyQt6"

inherit rpm
