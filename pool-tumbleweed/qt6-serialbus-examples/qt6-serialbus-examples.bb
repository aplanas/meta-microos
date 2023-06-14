SUMMARY = "Examples for the qt6-serialbus modules"
DESCRIPTION = "Examples for the qt6-serialbus modules."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-serialbus-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "853dd3c842a7ecd1604c74baf16a1125d6dc42aa8c38893a59cb2b6ef7838a131dc78b805b6878d296d0fb4a7a491394ed3a33f94ff1d078f087f18a8bfff5b7"

RPROVIDES:${PN} += "qt6-serialbus-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6SerialBus.so.6 \
libQt6SerialPort.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
