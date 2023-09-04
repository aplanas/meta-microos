SUMMARY = "Development files for the Qt 6 OpenGLWidgets library"
DESCRIPTION = "Development files for the Qt 6 OpenGLWidgets library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-openglwidgets-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "bf59930a8c7a889a14871d606b427e08c48fe4a9bb685e9af2a7b901d084b6abbeff481bf8cd6f3de29707dce4e159044ba4f009da0441dbe509ca06bea2fe56"

RPROVIDES:${PN} += "cmake-Qt6OpenGLWidgets \
pkgconfig-Qt6OpenGLWidgets \
qt6-openglwidgets-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-libGLESv3-devel \
cmake-Qt6OpenGL \
cmake-Qt6Widgets \
libQt6OpenGLWidgets6 \
pkgconfig-Qt6OpenGL \
pkgconfig-Qt6Widgets \
pkgconfig-glesv2"

inherit rpm
