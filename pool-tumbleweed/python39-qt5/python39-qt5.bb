SUMMARY = "Python bindings for Qt 5"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python39-qt5-5.15.9-1.6.aarch64.rpm"
RPM_HASH = "fe24c5d65513539297ab78433ac66b12af22685fc76db24df1637486360abe58afd32690f47a2aa456635f0a82ac349dd3451aea05a7c20a73124abf8b906391"

RPROVIDES:${PN} += "libpy3.9qt5qmlplugin.so()(64bit) \
python3.9dist(pyqt5) \
python39-PyQt5 \
python39-qt5 \
python39-qt5(aarch-64) \
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
libpython3.9.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python39-dbus-python \
python39-qt5-sip"

inherit rpm
