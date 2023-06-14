SUMMARY = "Qt 6 QuickTest library"
DESCRIPTION = "The Qt 6 QuickTest library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickTest6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "4ceea72c2d9fecf6c2b365189c46d1ae75b675e83516a8a8f3712d00e18d717f277bd4253ee5588c5da421c9f337fc66e5d22af193acc7bc68ffefa693dae9ee"

RPROVIDES:${PN} += "libQt6QuickTest.so.6 \
libQt6QuickTest6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Test.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
