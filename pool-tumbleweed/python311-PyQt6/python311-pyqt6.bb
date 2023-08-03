SUMMARY = "Python bindings for Qt 6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework."
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.5.1"

RPM_NAME = "python311-PyQt6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "e391c44343fdeab223e2a1ca94cd0e96f4da8cabba14b797bc7e416b26d9085ac0f4fe2bac4c596685af242392359ad4e0a52ea15f4d56e4baa04fe1e9b75968"

RPROVIDES:${PN} += "libpy3.11qt6qmlplugin.so \
python3-PyQt6 \
python3-qt6 \
python3.11dist-pyqt6 \
python311-PyQt6 \
python311-qt6 \
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
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi \
python311-PyQt6-sip \
python311-dbus-python"

inherit rpm
