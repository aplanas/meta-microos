SUMMARY = "Qt 6 LabsAnimation library"
DESCRIPTION = "The Qt 6 LabsAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6LabsAnimation6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "dc83939ef1a93c1725770c486a515851cac49d0925116b2e4fb185019e2d5475b92d7269b1c0482d3fb489c828dab94ba85f5bb3f2662c6ba4fbb38219d6a7d7"

RPROVIDES:${PN} += "libQt6LabsAnimation.so.6 \
libQt6LabsAnimation6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
