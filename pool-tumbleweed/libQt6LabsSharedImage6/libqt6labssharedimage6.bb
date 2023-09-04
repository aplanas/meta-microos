SUMMARY = "Qt 6 LabsSharedImage library"
DESCRIPTION = "The Qt 6 LabsSharedImage library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6LabsSharedImage6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "59bc74708fe1fa8458e4d9e83a602424e8a19c7ae4ec537d9bd6f9bd6e38c78075d1c6388bb2e6a248fac5a229b7c685bb8532a6efbab632b7abd627cb359974"

RPROVIDES:${PN} += "libQt6LabsSharedImage.so.6 \
libQt6LabsSharedImage6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
