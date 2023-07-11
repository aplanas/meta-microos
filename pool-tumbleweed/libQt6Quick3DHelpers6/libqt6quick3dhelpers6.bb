SUMMARY = "Qt 6 Quick3DHelpers library"
DESCRIPTION = "The Qt 6 Quick3DHelpers library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DHelpers6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "2fe547fea1b56f5113c665bc7ab81ef4196044dfcb424e129ba7f224ad9abcbf3059c95af8ac7c7bcc56986d957558d65c30ec9b6f5ac01d5672987326bafbb2"

RPROVIDES:${PN} += "libQt6Quick3DHelpers.so.6 \
libQt6Quick3DHelpers6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick3D.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
