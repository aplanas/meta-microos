SUMMARY = "Development files for the Qt5 OpenGL library"
DESCRIPTION = "Development files for the Qt5 OpenGL library. \
 \
Warning: This module should not be used anymore for new code. Please \
use the corresponding OpenGL classes in Qt GUI."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5OpenGL-devel-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "fa7380ad26cdb769f54772e0d0898fa74e3dddee5480c392acd7021536dbc8a71e46d3119ad416397369ad456ef9a2454d773bff79ec8759472d92398ed1f224"

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
