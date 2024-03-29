SUMMARY = "Python bindings for Qt 6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework."
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.5.1"

RPM_NAME = "python39-PyQt6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "9864304bd47e01e9151abaf3ac296fd09c7ac662ec4b9f06aaa59e11376169a807d2b699a937c626a6a8ddcd24d5b2d093c89dd6874b6854ea00f687d527f14f"

RPROVIDES:${PN} += "libpy3.9qt6qmlplugin.so \
python3.9dist-pyqt6 \
python39-PyQt6 \
python39-qt6 \
python3dist-pyqt6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libQt6Bluetooth.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Designer.so.6 \
libQt6Gui.so.6 \
libQt6Help.so.6 \
libQt6Multimedia.so.6 \
libQt6MultimediaWidgets.so.6 \
libQt6Network.so.6 \
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
libQt6QuickWidgets.so.6 \
libQt6RemoteObjects.so.6 \
libQt6Sensors.so.6 \
libQt6SerialPort.so.6 \
libQt6SpatialAudio.so.6 \
libQt6Sql.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Test.so.6 \
libQt6TextToSpeech.so.6 \
libQt6WebChannel.so.6 \
libQt6WebSockets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.9.so.1.0 \
libstdc++.so.6 \
python-abi \
python39-PyQt6-sip \
python39-dbus-python"

inherit rpm
