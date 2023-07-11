SUMMARY = "Qt OpenGLExtensions module"
DESCRIPTION = "Qt OpenGLExtensions module."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5OpenGLExtensions-devel-static-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "5f59a3e1d013a71c1b2e9e918fc273bf51223caef921c45a2e4e6b2b6cdd77b915ef97b44d175a0a46dc9000e0bd30d3a4afff52baba34f930ce2fa279ac990e"

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
