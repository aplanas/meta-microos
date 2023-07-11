SUMMARY = "Qt 5 PlatformHeaders"
DESCRIPTION = "Qt 5 PlatformHeaders."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5PlatformHeaders-devel-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "7ade0fcb5b1dde0e598a7b5a175960436b06e7f8a1b80153df2ee6c4c332f155456aff02628476ff2ef5c85056c6cf81c9033ee27681be8df0c73cf88eaf02b2"

RPROVIDES:${PN} += "libQt5PlatformHeaders-devel"

RDEPENDS:${PN} += "Mesa-libGLESv3-devel \
libQt5Core-devel \
libQt5Gui-devel \
pkgconfig-egl \
pkgconfig-glesv2 \
pkgconfig-x11"

inherit rpm
