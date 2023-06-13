SUMMARY = "LightDM Qt5-based Client Library"
DESCRIPTION = "A Qt5-based library for LightDM clients to use to interface with \
LightDM."
LICENSE = "LGPL-2.0-only | LGPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "liblightdm-qt5-3-0-1.32.0-2.2.aarch64.rpm"
RPM_HASH = "42bd1af8715593db92c1cc3d100ce2e1ae9fe853e8f38e44d85b9083e196b727cb2d34c16945ff0958f3c4cf9d24006127e4aec4b0b6a92f0e01b633d8ff4194"

RPROVIDES:${PN} += "liblightdm-qt-3-0 \
liblightdm-qt5-3-0 \
liblightdm-qt5-3-0(aarch-64) \
liblightdm-qt5-3.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgobject-2.0.so.0()(64bit) \
liblightdm-gobject-1.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
