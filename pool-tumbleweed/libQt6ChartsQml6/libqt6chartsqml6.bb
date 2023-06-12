SUMMARY = "Qt 6 ChartsQml library"
DESCRIPTION = "The Qt 6 ChartsQml library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6ChartsQml6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "dfc8d96847c8fbc1601781624d5fe895bb1ec7333a9781f1cca21f3c89fb763a41de8ea523fc7c7a8013c49c3f97c9ab1862de3b4ab4e90ece4fdc20523c7490"

RPROVIDES:${PN} += "libQt6ChartsQml.so.6()(64bit) \
libQt6ChartsQml.so.6(Qt_6)(64bit) \
libQt6ChartsQml.so.6(Qt_6.0)(64bit) \
libQt6ChartsQml.so.6(Qt_6.1)(64bit) \
libQt6ChartsQml.so.6(Qt_6.2)(64bit) \
libQt6ChartsQml.so.6(Qt_6.3)(64bit) \
libQt6ChartsQml.so.6(Qt_6.4)(64bit) \
libQt6ChartsQml.so.6(Qt_6.5)(64bit) \
libQt6ChartsQml.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6ChartsQml6 \
libQt6ChartsQml6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Charts.so.6()(64bit) \
libQt6Charts.so.6(Qt_6)(64bit) \
libQt6Charts.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6OpenGL.so.6()(64bit) \
libQt6OpenGL.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
