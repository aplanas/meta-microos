SUMMARY = "Shared library containing the QwtPlot3D Widget set"
DESCRIPTION = "QwtPlot3D is not a program, but a feature-rich Qt/OpenGL-based C++ \
programming library. It provides essentially a bunch of 3D widgets \
for programmers."
LICENSE = "Zlib"

PV = "0.2.7+git20190410.a6d0890d"

RPM_NAME = "libqwtplot3d-qt5-0-0.2.7+git20190410.a6d0890d-1.21.aarch64.rpm"
RPM_HASH = "fb44cd83f8adef2960a9eb09c34e3e1f26f42709c2a99c62a08964b5a31dc686081d71df595237d1791c8a5e9a3675652995760a9dc3d6150a6e8a1623dcf63a"

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
