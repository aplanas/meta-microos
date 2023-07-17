SUMMARY = "Qt 6 LabsSettings library"
DESCRIPTION = "The Qt 6 LabsSettings library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6LabsSettings6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "d6240bccb6f2383b9bf0127a07d0320e4ba77c248da9070f0bb5ede0e48111d5cec027ac8ec075f2d6569cfd179f5cc51e66c649e2047dd16f43f734b505fe6c"

RPROVIDES:${PN} += "libQt6LabsSettings.so.6 \
libQt6LabsSettings6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
