SUMMARY = "Development files for the Qt5 OpenGL library"
DESCRIPTION = "Development files for the Qt5 OpenGL library. \
 \
Warning: This module should not be used anymore for new code. Please \
use the corresponding OpenGL classes in Qt GUI."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5OpenGL-devel-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "3b901da27ea6020be666e6622dc0fbabbcd3ad7b0400a098ec0305ab6f8d9584e1bab0945e6fa52d47a690c4fab3b662b6164d81974fd66e3a74c7114eb7700c"

RPROVIDES:${PN} += "cmake-Qt5OpenGL \
libQt5OpenGL-devel \
pkgconfig-Qt5OpenGL"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-libGLESv3-devel \
libQt5Core-devel \
libQt5Gui-devel \
libQt5OpenGL5 \
libQt5Widgets-devel \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Widgets \
pkgconfig-glesv2"

inherit rpm
