SUMMARY = "Qt 6 CUPS plugin"
DESCRIPTION = "The Qt printsupport CUPS plugin."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-printsupport-cups-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "13256d140129e16ea1b029501ec6c52f107018718e57c997b67ee9d04816787bdcfe7cba7f5751b4eeac1f0f56aadb21dfbf1a1dd192db4f462ba8116ec44f78"

RPROVIDES:${PN} += "libcupsprintersupport.so()(64bit) \
libcupsprintersupport.so(Qt_6)(64bit) \
libcupsprintersupport.so(Qt_6.0)(64bit) \
libcupsprintersupport.so(Qt_6.1)(64bit) \
libcupsprintersupport.so(Qt_6.2)(64bit) \
libcupsprintersupport.so(Qt_6.3)(64bit) \
libcupsprintersupport.so(Qt_6.4)(64bit) \
libcupsprintersupport.so(Qt_6.5)(64bit) \
libcupsprintersupport.so(Qt_6.5.1_PRIVATE_API)(64bit) \
qt6-printsupport-cups \
qt6-printsupport-cups(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6PrintSupport.so.6()(64bit) \
libQt6PrintSupport.so.6(Qt_6)(64bit) \
libQt6PrintSupport.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6PrintSupport6 \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcups.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
