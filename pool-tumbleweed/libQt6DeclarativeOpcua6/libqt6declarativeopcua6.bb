SUMMARY = "Qt 6 DeclarativeOpcua library"
DESCRIPTION = "Qt 6 DeclarativeOpcua library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6DeclarativeOpcua6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "efa5d38e0c233e7811e3e62eafba415ea3adb62a6ae8f477f209b9e0725a5443a9f06b23e7d4d55be0804598d5bed72f5cbbe7728c52411ceca90b2c2765f145"

RPROVIDES:${PN} += "libQt6DeclarativeOpcua.so.6()(64bit) \
libQt6DeclarativeOpcua.so.6(Qt_6)(64bit) \
libQt6DeclarativeOpcua.so.6(Qt_6.0)(64bit) \
libQt6DeclarativeOpcua.so.6(Qt_6.1)(64bit) \
libQt6DeclarativeOpcua.so.6(Qt_6.2)(64bit) \
libQt6DeclarativeOpcua.so.6(Qt_6.3)(64bit) \
libQt6DeclarativeOpcua.so.6(Qt_6.4)(64bit) \
libQt6DeclarativeOpcua.so.6(Qt_6.5)(64bit) \
libQt6DeclarativeOpcua.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6DeclarativeOpcua6 \
libQt6DeclarativeOpcua6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6OpcUa.so.6()(64bit) \
libQt6OpcUa.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
