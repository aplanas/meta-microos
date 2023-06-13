SUMMARY = "Qt 6 LabsSharedImage library"
DESCRIPTION = "The Qt 6 LabsSharedImage library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6LabsSharedImage6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "03b2aedbc167f6a768aa3eb55a00f6ce93a2c25c3d859c11bc504d0c4970c0590d51b88e6339bf0479e8c60d3b9b62f9d4f2a110e5b8aa03b14486657f743fc5"

RPROVIDES:${PN} += "libQt6LabsSharedImage.so.6()(64bit) \
libQt6LabsSharedImage.so.6(Qt_6)(64bit) \
libQt6LabsSharedImage6 \
libQt6LabsSharedImage6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
