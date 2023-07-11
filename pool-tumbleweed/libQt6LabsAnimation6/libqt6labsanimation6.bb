SUMMARY = "Qt 6 LabsAnimation library"
DESCRIPTION = "The Qt 6 LabsAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6LabsAnimation6-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "b260e0e7a6666292f9166665643f3d30280d53fa7e4a45ccf41036fcfc80018236562ab030530bb4f082a2f68c8b46226d54eccbe2ca9d5589561e329cee0736"

RPROVIDES:${PN} += "libQt6LabsAnimation.so.6 \
libQt6LabsAnimation6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
