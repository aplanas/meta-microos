SUMMARY = "Python bindings for Qt"
DESCRIPTION = "The PySide2 project provides Python bindings for the Qt \
application and UI framework."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-2.0-only & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "5.15.9"

RPM_NAME = "python3-pyside2-5.15.9-1.2.aarch64.rpm"
RPM_HASH = "9639f5d1d13c471c486b010864d0cb59c981bf483b627bc2e373852c820ff2417951843e03fba0d63fb457ae7e7e92ff2e47301124e079ff0bead0b7b9ea8f30"

RPROVIDES:${PN} += "libpyside2.cpython-310-aarch64-linux-gnu.so.5.15()(64bit) \
libshiboken2.cpython-310-aarch64-linux-gnu.so.5.15()(64bit) \
python3-PySide2 \
python3-pyside2 \
python3-pyside2(aarch-64) \
python3-shiboken2 \
python3-shiboken2_generator \
python3.10dist(pyside2) \
python3.10dist(shiboken2) \
python3.10dist(shiboken2-generator) \
python3dist(pyside2) \
python3dist(shiboken2) \
python3dist(shiboken2-generator)"
RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt53DAnimation.so.5()(64bit) \
libQt53DAnimation.so.5(Qt_5)(64bit) \
libQt53DCore.so.5()(64bit) \
libQt53DCore.so.5(Qt_5)(64bit) \
libQt53DExtras.so.5()(64bit) \
libQt53DExtras.so.5(Qt_5)(64bit) \
libQt53DInput.so.5()(64bit) \
libQt53DInput.so.5(Qt_5)(64bit) \
libQt53DLogic.so.5()(64bit) \
libQt53DLogic.so.5(Qt_5)(64bit) \
libQt53DRender.so.5()(64bit) \
libQt53DRender.so.5(Qt_5)(64bit) \
libQt5Charts.so.5()(64bit) \
libQt5Charts.so.5(Qt_5)(64bit) \
libQt5Charts.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5DataVisualization.so.5()(64bit) \
libQt5DataVisualization.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Help.so.5()(64bit) \
libQt5Help.so.5(Qt_5)(64bit) \
libQt5Location.so.5()(64bit) \
libQt5Location.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5MultimediaWidgets.so.5()(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5OpenGL.so.5()(64bit) \
libQt5OpenGL.so.5(Qt_5)(64bit) \
libQt5Positioning.so.5()(64bit) \
libQt5Positioning.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Qml.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Quick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQt5RemoteObjects.so.5()(64bit) \
libQt5RemoteObjects.so.5(Qt_5)(64bit) \
libQt5Script.so.5()(64bit) \
libQt5Script.so.5(Qt_5)(64bit) \
libQt5ScriptTools.so.5()(64bit) \
libQt5ScriptTools.so.5(Qt_5)(64bit) \
libQt5Scxml.so.5()(64bit) \
libQt5Scxml.so.5(Qt_5)(64bit) \
libQt5Sensors.so.5()(64bit) \
libQt5Sensors.so.5(Qt_5)(64bit) \
libQt5SerialPort.so.5()(64bit) \
libQt5SerialPort.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Test.so.5()(64bit) \
libQt5Test.so.5(Qt_5)(64bit) \
libQt5TextToSpeech.so.5()(64bit) \
libQt5TextToSpeech.so.5(Qt_5)(64bit) \
libQt5WebChannel.so.5()(64bit) \
libQt5WebChannel.so.5(Qt_5)(64bit) \
libQt5WebEngine.so.5()(64bit) \
libQt5WebEngine.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5WebSockets.so.5()(64bit) \
libQt5WebSockets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libQt5XmlPatterns.so.5()(64bit) \
libQt5XmlPatterns.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libclang.so.13()(64bit) \
libclang.so.13(LLVM_13)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.8)(64bit) \
libxslt.so.1()(64bit) \
libxslt.so.1(LIBXML2_1.0.11)(64bit) \
libxslt.so.1(LIBXML2_1.0.18)(64bit) \
libxslt.so.1(LIBXML2_1.1.18)(64bit) \
python(abi)"

inherit rpm