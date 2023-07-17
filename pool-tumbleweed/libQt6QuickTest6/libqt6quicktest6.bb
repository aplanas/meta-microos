SUMMARY = "Qt 6 QuickTest library"
DESCRIPTION = "The Qt 6 QuickTest library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickTest6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "033a865dc9321a710b73c648f79b0c17be2d98ffe60c37cbd798580b5341337432d3950e31e666d73023f162522c386a96bb3f95ca342b7410a2f1c26a0a5ee7"

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
