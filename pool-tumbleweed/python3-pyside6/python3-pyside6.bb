SUMMARY = "Python bindings for Qt 6"
DESCRIPTION = "Python bindings for the Qt cross-platform application and UI framework."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-2.0-only & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "python3-pyside6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "b4fe4c649702908e81a9530844349a147a138cce9d13d2ac26a54575e83eb434b527c7f4d2a2f244d884284bb1ee41825cbf183218dd3a9a46efe096c7cb7b5b"

RPROVIDES:${PN} += "libPySidePlugin.so()(64bit) \
libpyside6.abi3.so.6.5()(64bit) \
libpyside6qml.abi3.so.6.5()(64bit) \
python3-pyside6 \
python3-pyside6(aarch-64) \
python3.10dist(pyside6) \
python3dist(pyside6)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libGLESv2.so.2()(64bit) \
libQt63DAnimation.so.6()(64bit) \
libQt63DAnimation.so.6(Qt_6)(64bit) \
libQt63DCore.so.6()(64bit) \
libQt63DCore.so.6(Qt_6)(64bit) \
libQt63DExtras.so.6()(64bit) \
libQt63DExtras.so.6(Qt_6)(64bit) \
libQt63DInput.so.6()(64bit) \
libQt63DInput.so.6(Qt_6)(64bit) \
libQt63DLogic.so.6()(64bit) \
libQt63DLogic.so.6(Qt_6)(64bit) \
libQt63DRender.so.6()(64bit) \
libQt63DRender.so.6(Qt_6)(64bit) \
libQt63DRender.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Bluetooth.so.6()(64bit) \
libQt6Bluetooth.so.6(Qt_6)(64bit) \
libQt6Charts.so.6()(64bit) \
libQt6Charts.so.6(Qt_6)(64bit) \
libQt6Charts.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6DBus.so.6()(64bit) \
libQt6DBus.so.6(Qt_6)(64bit) \
libQt6DataVisualization.so.6()(64bit) \
libQt6DataVisualization.so.6(Qt_6)(64bit) \
libQt6Designer.so.6()(64bit) \
libQt6Designer.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Help.so.6()(64bit) \
libQt6Help.so.6(Qt_6)(64bit) \
libQt6HttpServer.so.6()(64bit) \
libQt6HttpServer.so.6(Qt_6)(64bit) \
libQt6Location.so.6()(64bit) \
libQt6Location.so.6(Qt_6)(64bit) \
libQt6Multimedia.so.6()(64bit) \
libQt6Multimedia.so.6(Qt_6)(64bit) \
libQt6MultimediaWidgets.so.6()(64bit) \
libQt6MultimediaWidgets.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6Network.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6NetworkAuth.so.6()(64bit) \
libQt6NetworkAuth.so.6(Qt_6)(64bit) \
libQt6Nfc.so.6()(64bit) \
libQt6Nfc.so.6(Qt_6)(64bit) \
libQt6OpenGL.so.6()(64bit) \
libQt6OpenGL.so.6(Qt_6)(64bit) \
libQt6OpenGLWidgets.so.6()(64bit) \
libQt6OpenGLWidgets.so.6(Qt_6)(64bit) \
libQt6Pdf.so.6()(64bit) \
libQt6Pdf.so.6(Qt_6)(64bit) \
libQt6PdfWidgets.so.6()(64bit) \
libQt6PdfWidgets.so.6(Qt_6)(64bit) \
libQt6Positioning.so.6()(64bit) \
libQt6Positioning.so.6(Qt_6)(64bit) \
libQt6PrintSupport.so.6()(64bit) \
libQt6PrintSupport.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Qml.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6Quick3D.so.6()(64bit) \
libQt6Quick3D.so.6(Qt_6)(64bit) \
libQt6QuickControls2.so.6()(64bit) \
libQt6QuickControls2.so.6(Qt_6)(64bit) \
libQt6QuickWidgets.so.6()(64bit) \
libQt6QuickWidgets.so.6(Qt_6)(64bit) \
libQt6RemoteObjects.so.6()(64bit) \
libQt6RemoteObjects.so.6(Qt_6)(64bit) \
libQt6Scxml.so.6()(64bit) \
libQt6Scxml.so.6(Qt_6)(64bit) \
libQt6Sensors.so.6()(64bit) \
libQt6Sensors.so.6(Qt_6)(64bit) \
libQt6SerialBus.so.6()(64bit) \
libQt6SerialBus.so.6(Qt_6)(64bit) \
libQt6SerialPort.so.6()(64bit) \
libQt6SerialPort.so.6(Qt_6)(64bit) \
libQt6SpatialAudio.so.6()(64bit) \
libQt6SpatialAudio.so.6(Qt_6)(64bit) \
libQt6Sql.so.6()(64bit) \
libQt6Sql.so.6(Qt_6)(64bit) \
libQt6StateMachine.so.6()(64bit) \
libQt6StateMachine.so.6(Qt_6)(64bit) \
libQt6Svg.so.6()(64bit) \
libQt6Svg.so.6(Qt_6)(64bit) \
libQt6SvgWidgets.so.6()(64bit) \
libQt6SvgWidgets.so.6(Qt_6)(64bit) \
libQt6Test.so.6()(64bit) \
libQt6Test.so.6(Qt_6)(64bit) \
libQt6TextToSpeech.so.6()(64bit) \
libQt6TextToSpeech.so.6(Qt_6)(64bit) \
libQt6UiTools.so.6()(64bit) \
libQt6UiTools.so.6(Qt_6)(64bit) \
libQt6WebChannel.so.6()(64bit) \
libQt6WebChannel.so.6(Qt_6)(64bit) \
libQt6WebEngineCore.so.6()(64bit) \
libQt6WebEngineCore.so.6(Qt_6)(64bit) \
libQt6WebEngineQuick.so.6()(64bit) \
libQt6WebEngineQuick.so.6(Qt_6)(64bit) \
libQt6WebEngineWidgets.so.6()(64bit) \
libQt6WebEngineWidgets.so.6(Qt_6)(64bit) \
libQt6WebSockets.so.6()(64bit) \
libQt6WebSockets.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libQt6Xml.so.6()(64bit) \
libQt6Xml.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libpython3.10.so.1.0()(64bit) \
libshiboken6.abi3.so.6.5()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
python(abi)"

inherit rpm