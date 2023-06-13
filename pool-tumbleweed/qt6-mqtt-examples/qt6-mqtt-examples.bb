SUMMARY = "Examples for the qt6-mqtt modules"
DESCRIPTION = "Examples for the qt6-mqtt modules."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-mqtt-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f857d8745e96720db2929d254b00df513ff02d4efbdb1763263744a65a0d274f66f2676c4c15f80a0ea644cdfe8216c20564f05076f169d479e46919bbb1906d"

RPROVIDES:${PN} += "qt6-mqtt-examples \
qt6-mqtt-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Mqtt.so.6()(64bit) \
libQt6Mqtt.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6WebSockets.so.6()(64bit) \
libQt6WebSockets.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
