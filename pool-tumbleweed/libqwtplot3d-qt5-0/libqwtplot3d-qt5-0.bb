SUMMARY = "Shared library containing the QwtPlot3D Widget set"
DESCRIPTION = "QwtPlot3D is not a program, but a feature-rich Qt/OpenGL-based C++ \
programming library. It provides essentially a bunch of 3D widgets \
for programmers."
LICENSE = "Zlib"

PV = "0.2.7+git20190410.a6d0890d"

RPM_NAME = "libqwtplot3d-qt5-0-0.2.7+git20190410.a6d0890d-1.22.aarch64.rpm"
RPM_HASH = "0585fc7aac4a383116df9ce1b50790a370b32f74c2927e2c56c453f2fb8cddb2d7e91ca9700ce6e805adb693b630829fd636718ff73f2a45716fc514daf87080"

RPROVIDES:${PN} += "libqwtplot3d-qt5-0 \
libqwtplot3d-qt5.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5OpenGL.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
