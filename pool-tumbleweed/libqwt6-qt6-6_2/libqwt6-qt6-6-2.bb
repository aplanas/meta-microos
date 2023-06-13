SUMMARY = "Shared library for Qt6 Widgets for Technical Applications"
DESCRIPTION = "This package contains the shared library to run Technical Applications \
developed with/for Qwt(Qt5)."
LICENSE = "SUSE-QWT-1.0"

PV = "6.2.0"

RPM_NAME = "libqwt6-qt6-6_2-6.2.0-2.1.aarch64.rpm"
RPM_HASH = "b543359d459bd3b025b5e2a161aedeee4c68818abbc813f2eb131fd7e5e029894e9fbd295bbec6f6b8e6049e62749b9e15460b7f8c671aaa0f646af7bef8e98f"

RPROVIDES:${PN} += "libqwt-qt6.so.6.2()(64bit) \
libqwt6-qt6-6_2 \
libqwt6-qt6-6_2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6OpenGL.so.6()(64bit) \
libQt6OpenGL.so.6(Qt_6)(64bit) \
libQt6OpenGLWidgets.so.6()(64bit) \
libQt6OpenGLWidgets.so.6(Qt_6)(64bit) \
libQt6Svg.so.6()(64bit) \
libQt6Svg.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
