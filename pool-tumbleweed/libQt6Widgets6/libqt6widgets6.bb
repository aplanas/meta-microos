SUMMARY = "Qt 6 Widgets library"
DESCRIPTION = "The Qt Widgets library provides a set of UI elements to create classic \
desktop-style user interfaces."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6Widgets6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "4ccdcf8b6c5102129e523a09e79ca3d4d7e489cf3a069e17a05c8bd5cc72706bbceb8413c50717c9d20f718fd143055822547f47c7057f99fc299d1d65f3823d"

RPROVIDES:${PN} += "libQt6Widgets.so.6 \
libQt6Widgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Gui6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
