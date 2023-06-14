SUMMARY = "Qt5 Serial Port examples"
DESCRIPTION = "Examples for the libqt5-qtserialport module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtserialport-examples-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "8315c9f99371d99698700c5a8f592b851dcc302eaa0cf0e041889f4ea578ec2a9648bcf3266abbd7d969e2983f93310e4c14360f8707d3af6d429145839bc0ca"

RPROVIDES:${PN} += "libqt5-qtserialport-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5SerialPort.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
