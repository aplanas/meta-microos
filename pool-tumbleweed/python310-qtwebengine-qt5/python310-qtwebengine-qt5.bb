SUMMARY = "Python bindings for the Qt5 WebEngine framework"
DESCRIPTION = "PyQtWebEngine is a set of Python bindings for the Qt5 WebEngine \
framework. The framework provides the ability to embed web \
content in applications."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python310-qtwebengine-qt5-5.15.6-1.7.aarch64.rpm"
RPM_HASH = "16a3c377d11939071c5377dbf03c023aa6549c71ba77d37a5c54e0fe1a37f4005ff13277dad2482b9c5f425ada20bf1dafc1e919f42bb3d70a7fb356d2cb7e1a"

RPROVIDES:${PN} += "python3-PyQtWebEngine \
python3-qtwebengine-qt5 \
python3.10dist(pyqtwebengine) \
python310-PyQtWebEngine \
python310-qtwebengine-qt5 \
python310-qtwebengine-qt5(aarch-64) \
python3dist(pyqtwebengine)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5WebEngine.so.5()(64bit) \
libQt5WebEngine.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
python(abi) \
python310-qt5 \
python310-qt5-sip"

inherit rpm
