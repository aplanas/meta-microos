SUMMARY = "Qt5 D-Bus library"
DESCRIPTION = "The Qt D-Bus module is a library that can be used to perform \
inter-process communication using the D-Bus protocol."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5DBus5-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "d8f23f258c8e34d5fd53071738789517cfc95abc10d31a88f8c8e469ee7a2b000d70c6504702c5d93a14384459fe22c16ba19aea6210571f855d2491b832fa98"

RPROVIDES:${PN} += "libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5DBus5 \
libQt5DBus5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core5 \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
