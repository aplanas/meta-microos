SUMMARY = "Python bindings for Qt 5"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python310-qt5-5.15.9-3.1.aarch64.rpm"
RPM_HASH = "d428a39efc4ffcda660face73c6dc09aa2526d2670b99222e217b50c2b0a908257b9f865c471ae51f40c84eb965c880def25709debaf54261ada03063f742337"

RPROVIDES:${PN} += "libpy3.10qt5qmlplugin.so \
python3.10dist-pyqt5 \
python310-PyQt5 \
python310-qt5 \
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
libpython3.10.so.1.0 \
libstdc++.so.6 \
python-abi \
python310-dbus-python \
python310-qt5-sip"

inherit rpm
