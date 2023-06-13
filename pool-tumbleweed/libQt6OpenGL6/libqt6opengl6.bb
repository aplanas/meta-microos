SUMMARY = "Qt 6 OpenGL library"
DESCRIPTION = "The Qt OpenGL module provides an OpenGL widget class that can be used \
like any other Qt widget, except that it opens an OpenGL display \
buffer where the OpenGL API can be used to render the contents."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6OpenGL6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "45115c2ac3442f6b7c5865cb85ff95f233dbf3ae1008e02fb4510c4df3b854c5e32deb0703b9bf4b357238779637b5a8e2d64a6e19e57475c562a72acf9ba3ca"

RPROVIDES:${PN} += "libQt6OpenGL.so.6()(64bit) \
libQt6OpenGL.so.6(Qt_6)(64bit) \
libQt6OpenGL.so.6(Qt_6.0)(64bit) \
libQt6OpenGL.so.6(Qt_6.1)(64bit) \
libQt6OpenGL.so.6(Qt_6.2)(64bit) \
libQt6OpenGL.so.6(Qt_6.3)(64bit) \
libQt6OpenGL.so.6(Qt_6.4)(64bit) \
libQt6OpenGL.so.6(Qt_6.5)(64bit) \
libQt6OpenGL.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6OpenGL6 \
libQt6OpenGL6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGLESv2.so.2()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Widgets6 \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
