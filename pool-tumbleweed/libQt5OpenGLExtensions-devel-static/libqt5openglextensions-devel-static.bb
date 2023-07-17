SUMMARY = "Qt OpenGLExtensions module"
DESCRIPTION = "Qt OpenGLExtensions module."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5OpenGLExtensions-devel-static-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "49fa98efd10ac5400e96f5dcb584c79092a06bc1dfa346832f0fbf7898d79a1924478bc7a5c0eae2980fb26fef787f73db7f7f0665a8eba89fd74d2192643018"

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
