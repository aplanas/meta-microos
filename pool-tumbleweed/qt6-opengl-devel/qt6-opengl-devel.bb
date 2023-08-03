SUMMARY = "Development files for the Qt 6 OpenGL library"
DESCRIPTION = "Development files for the Qt 6 OpenGL library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-opengl-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "0d45cedfd53750b0f6b49e3409c98cd3ae2423cdca97264392fd465a708267a0547a4a37655b19e556c74656286f63e7af84a660247acb9f3ea43bb0ab0d7b60"

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
