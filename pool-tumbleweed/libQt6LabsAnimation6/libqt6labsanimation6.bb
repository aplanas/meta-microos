SUMMARY = "Qt 6 LabsAnimation library"
DESCRIPTION = "The Qt 6 LabsAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6LabsAnimation6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "b46cc15b3d199fc3f1174f0132affc2229627fd83cc9cbcff97c1680bd3880309763e7faca8201cb37eeefa6f057a0b388f939a9d3d5a807fb9466683df1692a"

RPROVIDES:${PN} += "libQt6LabsAnimation.so.6 \
libQt6LabsAnimation6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
