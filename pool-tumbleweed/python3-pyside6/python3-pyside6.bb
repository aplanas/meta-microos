SUMMARY = "Python bindings for Qt 6"
DESCRIPTION = "Python bindings for the Qt cross-platform application and UI framework."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-2.0-only & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "python3-pyside6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "b4fe4c649702908e81a9530844349a147a138cce9d13d2ac26a54575e83eb434b527c7f4d2a2f244d884284bb1ee41825cbf183218dd3a9a46efe096c7cb7b5b"

RPROVIDES:${PN} += "libPySidePlugin.so \
libpyside6.abi3.so.6.5 \
libpyside6qml.abi3.so.6.5 \
python3-pyside6 \
python3.10dist-pyside6 \
python3dist-pyside6"

RDEPENDS:${PN} += "/sbin/ldconfig \
libGLESv2.so.2 \
libQt63DAnimation.so.6 \
libQt63DCore.so.6 \
libQt63DExtras.so.6 \
libQt63DInput.so.6 \
libQt63DLogic.so.6 \
libQt63DRender.so.6 \
libQt6Bluetooth.so.6 \
libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6DataVisualization.so.6 \
libQt6Designer.so.6 \
libQt6Gui.so.6 \
libQt6Help.so.6 \
libQt6HttpServer.so.6 \
libQt6Location.so.6 \
libQt6Multimedia.so.6 \
libQt6MultimediaWidgets.so.6 \
libQt6Network.so.6 \
libQt6NetworkAuth.so.6 \
libQt6Nfc.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Pdf.so.6 \
libQt6PdfWidgets.so.6 \
libQt6Positioning.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Quick3D.so.6 \
libQt6QuickControls2.so.6 \
libQt6QuickWidgets.so.6 \
libQt6RemoteObjects.so.6 \
libQt6Scxml.so.6 \
libQt6Sensors.so.6 \
libQt6SerialBus.so.6 \
libQt6SerialPort.so.6 \
libQt6SpatialAudio.so.6 \
libQt6Sql.so.6 \
libQt6StateMachine.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Test.so.6 \
libQt6TextToSpeech.so.6 \
libQt6UiTools.so.6 \
libQt6WebChannel.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineQuick.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6WebSockets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.10.so.1.0 \
libshiboken6.abi3.so.6.5 \
libstdc++.so.6 \
python-abi"

inherit rpm
