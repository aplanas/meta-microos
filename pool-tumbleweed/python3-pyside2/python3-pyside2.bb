SUMMARY = "Python bindings for Qt"
DESCRIPTION = "The PySide2 project provides Python bindings for the Qt \
application and UI framework."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-2.0-only & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.10"

RPM_NAME = "python3-pyside2-5.15.10-1.1.aarch64.rpm"
RPM_HASH = "c009e9c7dbb08cefdc21537253244a494f52016a3697d7797859c4623e8b7b2d03f29bb0bfcbbc95309659d46592cb92802029a2e2f76b9b6132c6d4196224af"

RPROVIDES:${PN} += "libpyside2.cpython-311-aarch64-linux-gnu.so.5.15 \
libshiboken2.cpython-311-aarch64-linux-gnu.so.5.15 \
python3-PySide2 \
python3-pyside2 \
python3-shiboken2 \
python3-shiboken2-generator \
python3.11dist-pyside2 \
python3.11dist-shiboken2 \
python3.11dist-shiboken2-generator \
python3dist-pyside2 \
python3dist-shiboken2 \
python3dist-shiboken2-generator"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1 \
libQt53DAnimation.so.5 \
libQt53DCore.so.5 \
libQt53DExtras.so.5 \
libQt53DInput.so.5 \
libQt53DLogic.so.5 \
libQt53DRender.so.5 \
libQt5Charts.so.5 \
libQt5Core.so.5 \
libQt5DataVisualization.so.5 \
libQt5Gui.so.5 \
libQt5Help.so.5 \
libQt5Location.so.5 \
libQt5Multimedia.so.5 \
libQt5MultimediaWidgets.so.5 \
libQt5Network.so.5 \
libQt5OpenGL.so.5 \
libQt5Positioning.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5QuickWidgets.so.5 \
libQt5RemoteObjects.so.5 \
libQt5Script.so.5 \
libQt5ScriptTools.so.5 \
libQt5Scxml.so.5 \
libQt5Sensors.so.5 \
libQt5SerialPort.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5Test.so.5 \
libQt5TextToSpeech.so.5 \
libQt5WebChannel.so.5 \
libQt5WebEngine.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5WebSockets.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libQt5XmlPatterns.so.5 \
libc.so.6 \
libclang.so.13 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
libxml2.so.2 \
libxslt.so.1 \
python-abi"

inherit rpm
