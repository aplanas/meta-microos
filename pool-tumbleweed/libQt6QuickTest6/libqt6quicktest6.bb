SUMMARY = "Qt 6 QuickTest library"
DESCRIPTION = "The Qt 6 QuickTest library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6QuickTest6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "4070c6c3ec067cf685013d5027a8c8830dd6e11250fc9e1bb66bb167397a854d940fc4cfa0fd3c1bcb2db979b523f968273b1e4c7687d2613bd9f219e86fc3b5"

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
