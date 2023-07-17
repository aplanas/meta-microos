SUMMARY = "Qt 6 Qml library"
DESCRIPTION = "The Qt 6 Qml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6Qml6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "650ed5853340c5022e672ce7b03898fe1699439be764d6edc00e48efd08b38703f274bac50545e55227f13acb9f68a77bd364808403af0cd887eb59989706115"

RPROVIDES:${PN} += "libQt6Qml.so.6 \
libQt6Qml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
