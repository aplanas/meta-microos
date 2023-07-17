SUMMARY = "Development files for the Qt 6 OpenGL library"
DESCRIPTION = "Development files for the Qt 6 OpenGL library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-opengl-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "5cdaaaa3e7a89a2ae6bab53cfad583f91ec607d4e2c9341b316d67020561f3ddbd5b738dac51ae9e1c20bfad517dadf0e9ad6a6e4dbac4a92b6fcf2a6b309e08"

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
