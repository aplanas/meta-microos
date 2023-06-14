SUMMARY = "Qt5 Serial Port examples"
DESCRIPTION = "Examples for the libqt5-qtserialbus module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtserialbus-examples-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "8b332948572b321144efe6011aca217aaa20e179194ab5aea16dd287b8552898f6372d19cfd5975d14f4871f0cca4ae74b7ea67f3ff8cdf54e6042e78b0ee299"

RPROVIDES:${PN} += "libqt5-qtserialbus-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5SerialBus.so.5 \
libQt5SerialPort.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
