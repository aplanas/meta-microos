SUMMARY = "Qt 6 Widgets library"
DESCRIPTION = "The Qt Widgets library provides a set of UI elements to create classic \
desktop-style user interfaces."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6Widgets6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "5d26adc9f3560feff396b384b36f10a9a7f6212bf79731091847a15eefaa41d6d9ecb52244cf2f07e7a825a825dfee72cee3e66f066fd1dd3916d7e93518d483"

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
