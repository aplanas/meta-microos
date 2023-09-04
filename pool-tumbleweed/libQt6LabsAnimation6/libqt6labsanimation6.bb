SUMMARY = "Qt 6 LabsAnimation library"
DESCRIPTION = "The Qt 6 LabsAnimation library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6LabsAnimation6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "647d9abe1ce3156a29941c1199353757499d1e03423770917654e86541310c37efbb3f3d8e02f2ca65f90aa473dc888580e6c7e6ef9482697ad9cb5c9f0ab6e7"

RPROVIDES:${PN} += "libQt6LabsAnimation.so.6 \
libQt6LabsAnimation6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
