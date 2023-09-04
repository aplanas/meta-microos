SUMMARY = "Development files for the Qt 6 OpenGL library"
DESCRIPTION = "Development files for the Qt 6 OpenGL library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-opengl-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "56e413bf9d092e4188e472a30b3925da2ec8000e52bb0e5a9eeb4bc72cbbed3cf27f3186c515c37046b37264a0b49179ab66273dcb6db7ad5cd8cfaa6c2878f6"

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
