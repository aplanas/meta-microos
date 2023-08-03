SUMMARY = "Qt 6 LabsSharedImage library"
DESCRIPTION = "The Qt 6 LabsSharedImage library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6LabsSharedImage6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "8fc639c91bafd2266fa975bd2a5e814cf28a976161f7604f5f996c7e8bf75fa25dc0e7b33e52fe9678240757fa21554992a9ad296f5c98fe127528d47c257cff"

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
