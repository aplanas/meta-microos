SUMMARY = "Qt 6 ScxmlQml library"
DESCRIPTION = "The Qt6 ScxmlQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6ScxmlQml6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "9853a5ba11a2da1f032634669b46c66fe660dcff9b0d182833a3736c6dfea7f563b4744e88eb4849574f5ad4a25d5aaba486c7bbb6376a1231e5984401b7adbf"

RPROVIDES:${PN} += "libQt6ScxmlQml.so.6()(64bit) \
libQt6ScxmlQml.so.6(Qt_6)(64bit) \
libQt6ScxmlQml.so.6(Qt_6.0)(64bit) \
libQt6ScxmlQml.so.6(Qt_6.1)(64bit) \
libQt6ScxmlQml.so.6(Qt_6.2)(64bit) \
libQt6ScxmlQml.so.6(Qt_6.3)(64bit) \
libQt6ScxmlQml.so.6(Qt_6.4)(64bit) \
libQt6ScxmlQml.so.6(Qt_6.5)(64bit) \
libQt6ScxmlQml.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6ScxmlQml6 \
libQt6ScxmlQml6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Scxml.so.6()(64bit) \
libQt6Scxml.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
