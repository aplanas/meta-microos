SUMMARY = "Qt 6 QuickControls2 library"
DESCRIPTION = "The Qt 6 QuickControls2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6QuickControls2-6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "b208347dab079785eb641fcad01600e378947ccd3f5462065b234c283e277976da3531afa81d48408321be8b87b89dae31ece4f394a8c88f9345b0ad01db8218"

RPROVIDES:${PN} += "libQt6QuickControls2-6 \
libQt6QuickControls2.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickTemplates2.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
