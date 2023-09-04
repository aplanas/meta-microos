SUMMARY = "Qt 6 LabsWavefrontMesh library"
DESCRIPTION = "The Qt 6 LabsWavefrontMesh library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6LabsWavefrontMesh6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "672998dd1d5aa1f4ecdb24f3807373dcb00898699924c1bd69ed9827db9af60347058aeb62b95b74ad2f311dfeced0df0aa3514cde5816052fcf618655571449"

RPROVIDES:${PN} += "libQt6LabsWavefrontMesh.so.6 \
libQt6LabsWavefrontMesh6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
