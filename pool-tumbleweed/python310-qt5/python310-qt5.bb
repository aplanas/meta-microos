SUMMARY = "Python bindings for Qt 5"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python310-qt5-5.15.9-1.6.aarch64.rpm"
RPM_HASH = "7cdf54c4ca3edb22c476bca152bac2f26630acef542e1070573e2dbe4dad6d593beb613194d767dcb296040d70eb4d648255fb5d8ff02c7bc32a41ca3713990d"

RPROVIDES:${PN} += "libpy3.10qt5qmlplugin.so()(64bit) \
python3-PyQt5 \
python3-qt5 \
python3.10dist(pyqt5) \
python310-PyQt5 \
python310-qt5 \
python310-qt5(aarch-64) \
python3dist(pyqt5)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libQt5Bluetooth.so.5()(64bit) \
libQt5Bluetooth.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Designer.so.5()(64bit) \
libQt5Designer.so.5(Qt_5)(64bit) \
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
libQt5Nfc.so.5()(64bit) \
libQt5Nfc.so.5(Qt_5)(64bit) \
libQt5OpenGL.so.5()(64bit) \
libQt5OpenGL.so.5(Qt_5)(64bit) \
libQt5Positioning.so.5()(64bit) \
libQt5Positioning.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
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
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libgcc_s.so.1()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python310-dbus-python \
python310-qt5-sip"

inherit rpm
