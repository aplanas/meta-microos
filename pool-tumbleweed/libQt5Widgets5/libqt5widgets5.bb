SUMMARY = "Qt 5 Widgets Library"
DESCRIPTION = "The Qt Widgets Module provides a set of UI elements to create classic \
desktop-style user interfaces."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Widgets5-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "ba230764ca09c797ebc3fbd3bb3de4ad602c2d86abd54e5fe6fe09a599bf7eb44ada08d0710e07b389a82410b43d6c1ba5f130450d6a4a8ca2437285786d040e"

RPROVIDES:${PN} += "libQt5Widgets.so.5 \
libQt5Widgets5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
