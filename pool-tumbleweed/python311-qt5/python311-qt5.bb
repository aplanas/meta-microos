SUMMARY = "Python bindings for Qt 5"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python311-qt5-5.15.9-3.1.aarch64.rpm"
RPM_HASH = "497a660a4827dc121901ead7b090cd49705b2af6cec72419f607edad178f982ce50eb4835afc8bd25574636fce4f61b601f4fdd915fcc16d68e0a2aea5bc39c3"

RPROVIDES:${PN} += "libpy3.11qt5qmlplugin.so \
python3-PyQt5 \
python3-qt5 \
python3.11dist-pyqt5 \
python311-PyQt5 \
python311-qt5 \
python3dist-pyqt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libQt5Bluetooth.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Designer.so.5 \
libQt5Gui.so.5 \
libQt5Help.so.5 \
libQt5Location.so.5 \
libQt5Multimedia.so.5 \
libQt5MultimediaWidgets.so.5 \
libQt5Network.so.5 \
libQt5Nfc.so.5 \
libQt5OpenGL.so.5 \
libQt5Positioning.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5SerialPort.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5Test.so.5 \
libQt5TextToSpeech.so.5 \
libQt5WebChannel.so.5 \
libQt5WebSockets.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libQt5XmlPatterns.so.5 \
libc.so.6 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi \
python311-dbus-python \
python311-qt5-sip"

inherit rpm
