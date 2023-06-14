SUMMARY = "Qt 6 LabsAnimation library"
DESCRIPTION = "The Qt 6 LabsAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6LabsAnimation6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "f72fa703764c97473da164d64c101f5ff616215ce0a960a4988c863299b3a23cf6e45d3297cde1ddec97ee9ffa7b46196b65c9326c5297d7708270590587918f"

RPROVIDES:${PN} += "libQt6LabsAnimation.so.6 \
libQt6LabsAnimation6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
