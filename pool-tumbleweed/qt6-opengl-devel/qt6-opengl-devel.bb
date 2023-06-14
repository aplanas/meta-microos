SUMMARY = "Development files for the Qt 6 OpenGL library"
DESCRIPTION = "Development files for the Qt 6 OpenGL library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-opengl-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "cc6668879b54c8a6a0104385536b84a6b757dfb3c3a7f483dcac266d7a78aec3f3a09a94047892da137791f790548672e89c3577c1346167d573fd96b24cea60"

RPROVIDES:${PN} += "cmake-Qt6OpenGL \
pkgconfig-Qt6OpenGL \
qt6-opengl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-libGLESv3-devel \
cmake-Qt6Core \
cmake-Qt6Gui \
libQt6OpenGL6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-glesv2"

inherit rpm
