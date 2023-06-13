SUMMARY = "Qt 6 LabsAnimation library"
DESCRIPTION = "The Qt 6 LabsAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6LabsAnimation6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "f72fa703764c97473da164d64c101f5ff616215ce0a960a4988c863299b3a23cf6e45d3297cde1ddec97ee9ffa7b46196b65c9326c5297d7708270590587918f"

RPROVIDES:${PN} += "libQt6LabsAnimation.so.6()(64bit) \
libQt6LabsAnimation.so.6(Qt_6)(64bit) \
libQt6LabsAnimation.so.6(Qt_6.0)(64bit) \
libQt6LabsAnimation.so.6(Qt_6.1)(64bit) \
libQt6LabsAnimation.so.6(Qt_6.2)(64bit) \
libQt6LabsAnimation.so.6(Qt_6.3)(64bit) \
libQt6LabsAnimation.so.6(Qt_6.4)(64bit) \
libQt6LabsAnimation.so.6(Qt_6.5)(64bit) \
libQt6LabsAnimation.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6LabsAnimation6 \
libQt6LabsAnimation6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Qml.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
