SUMMARY = "Qt5 Serial Port examples"
DESCRIPTION = "Examples for the libqt5-qtserialport module."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtserialport-examples-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "af3d1a260e4b489fe4785af94caf27249981f05ff5825762a0acc99ebda682eafb650b388fe739a8e373f2a7d289e8fde495f21d0441479c0322b9b885c89328"

RPROVIDES:${PN} += "libqt5-qtserialport-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5SerialPort.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
