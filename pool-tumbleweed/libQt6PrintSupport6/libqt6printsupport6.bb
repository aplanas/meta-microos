SUMMARY = "Qt 6 PrintSupport library"
DESCRIPTION = "An abstraction over the platform-specific printing systems. Using \
this library, Qt applications can print to attached printers and \
across networks to remote printers. Qt's printing system also \
supports PDF file generation, providing the foundation for basic \
report generation facilities."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6PrintSupport6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c9197bb73dac5ea757bfae8f6e1bf0a93421dad7a40f93b9d892dc68bbb974a787d73097761d28a048a7a754c41aa0c81cc0e20429e9f2e1efcf2a892d44c453"

RPROVIDES:${PN} += "libQt6PrintSupport.so.6()(64bit) \
libQt6PrintSupport.so.6(Qt_6)(64bit) \
libQt6PrintSupport.so.6(Qt_6.0)(64bit) \
libQt6PrintSupport.so.6(Qt_6.1)(64bit) \
libQt6PrintSupport.so.6(Qt_6.2)(64bit) \
libQt6PrintSupport.so.6(Qt_6.3)(64bit) \
libQt6PrintSupport.so.6(Qt_6.4)(64bit) \
libQt6PrintSupport.so.6(Qt_6.5)(64bit) \
libQt6PrintSupport.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6PrintSupport6 \
libQt6PrintSupport6(aarch-64)"

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
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Widgets6 \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
