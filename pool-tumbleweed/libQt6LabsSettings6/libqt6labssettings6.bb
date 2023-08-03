SUMMARY = "Qt 6 LabsSettings library"
DESCRIPTION = "The Qt 6 LabsSettings library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6LabsSettings6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "40de37f278a733601d2400eaa27f78a39669af14438955b165d5ccef0446ba87a2cba83041f8b4a9d03ea0c709b4ae4898874afb36f9eff71f18ced2592105a2"

RPROVIDES:${PN} += "libQt6LabsSettings.so.6 \
libQt6LabsSettings6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
