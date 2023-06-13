SUMMARY = "Qt6 D-Bus library"
DESCRIPTION = "The Qt D-Bus module is a library that can be used to perform \
inter-process communication using the D-Bus protocol."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6DBus6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "01cb5a13e427b4c1eb3b613f71f387449afcbfbb6af9f27fe0d2ac691ebf05e3524f8efc8753adf796d478796c4606eb57c8c09156ffcabdeaca0d3a763ab73c"

RPROVIDES:${PN} += "libQt6DBus.so.6()(64bit) \
libQt6DBus.so.6(Qt_6)(64bit) \
libQt6DBus6 \
libQt6DBus6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core6 \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
