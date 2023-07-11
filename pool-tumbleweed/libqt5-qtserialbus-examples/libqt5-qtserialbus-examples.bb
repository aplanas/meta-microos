SUMMARY = "Qt5 Serial Port examples"
DESCRIPTION = "Examples for the libqt5-qtserialbus module."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtserialbus-examples-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "36c63cc43b1a08b408d55a9db82d7399f3a8300106f4f91dc0144c2a78d3686b871c4aafc6c07925019f7ab2510c1b89e93554dce26f1ce240b0aaecd3163a47"

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
