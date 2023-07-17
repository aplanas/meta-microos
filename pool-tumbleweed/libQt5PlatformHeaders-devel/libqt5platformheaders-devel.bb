SUMMARY = "Qt 5 PlatformHeaders"
DESCRIPTION = "Qt 5 PlatformHeaders."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5PlatformHeaders-devel-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "be5aa43f6e49057a1b06b5edf6648511160d1589e388f25a879260a5b3fa8564b2d371ccf0719854099a15eea2b5304987d339595ea8cbd6f2e7593c34d4e7b8"

RPROVIDES:${PN} += "libQt5PlatformHeaders-devel"

RDEPENDS:${PN} += "Mesa-libGLESv3-devel \
libQt5Core-devel \
libQt5Gui-devel \
pkgconfig-egl \
pkgconfig-glesv2 \
pkgconfig-x11"

inherit rpm
