SUMMARY = "Qt OpenGLExtensions module"
DESCRIPTION = "Qt OpenGLExtensions module."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5OpenGLExtensions-devel-static-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "5d0270da5a1436798aa9a5e660d690d98c40bbde35f9d4a94adeb86fde9393bc22df934a4c644f9f81be7c81f31d8dfdc6b893c594abb94fbb69d2542ffed31c"

RPROVIDES:${PN} += "cmake-Qt5OpenGLExtensions \
libQt5OpenGLExtensions-devel-static \
pkgconfig-Qt5OpenGLExtensions"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core-devel \
libQt5Gui-devel \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-gl"

inherit rpm
