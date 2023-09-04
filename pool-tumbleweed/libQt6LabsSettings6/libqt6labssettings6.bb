SUMMARY = "Qt 6 LabsSettings library"
DESCRIPTION = "The Qt 6 LabsSettings library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6LabsSettings6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "8af7503c479cde8f948b0a08b507d8697cecf7a9764cc858adaa8ed457f54ea4e4fb31be508c38bf7bde82244d6406d1858dc73d21fba6291b80e5ddc59cb37e"

RPROVIDES:${PN} += "libQt6LabsSettings.so.6 \
libQt6LabsSettings6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
