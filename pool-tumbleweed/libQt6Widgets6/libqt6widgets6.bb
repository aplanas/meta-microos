SUMMARY = "Qt 6 Widgets library"
DESCRIPTION = "The Qt Widgets library provides a set of UI elements to create classic \
desktop-style user interfaces."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6Widgets6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "228d22590e863979c357efd5efe1b5805c7ed5ef06972b905820a756aaf7a8cc857dd310dc7b03519a023714866148052b19f5e42c66b500354af13c1269a019"

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
