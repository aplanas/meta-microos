SUMMARY = "Qt 6 QuickTemplates2 library"
DESCRIPTION = "The Qt 6 QuickTemplates2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickTemplates2-6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "f033751de1d6a2ce7109e543dad0bb6c64dbcf9acf4ec713e0628098af89573693d5bfa03c2b8ab094e3cea7152e655fba86c59ea43e33cef2cb0954cc58f590"

RPROVIDES:${PN} += "libQt6QuickTemplates2-6 \
libQt6QuickTemplates2-6(aarch-64) \
libQt6QuickTemplates2.so.6()(64bit) \
libQt6QuickTemplates2.so.6(Qt_6)(64bit) \
libQt6QuickTemplates2.so.6(Qt_6.0)(64bit) \
libQt6QuickTemplates2.so.6(Qt_6.1)(64bit) \
libQt6QuickTemplates2.so.6(Qt_6.2)(64bit) \
libQt6QuickTemplates2.so.6(Qt_6.3)(64bit) \
libQt6QuickTemplates2.so.6(Qt_6.4)(64bit) \
libQt6QuickTemplates2.so.6(Qt_6.5)(64bit) \
libQt6QuickTemplates2.so.6(Qt_6.5.1_PRIVATE_API)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Qml.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6QmlModels.so.6()(64bit) \
libQt6QmlModels.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6Quick.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
