SUMMARY = "Qt 6 LabsWavefrontMesh library"
DESCRIPTION = "The Qt 6 LabsWavefrontMesh library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6LabsWavefrontMesh6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "adb713de4c1e510002a08f407800ad3c4e6f475451ed87b8fcffe2b76c08c0b52bdf519c6414bac6fda70f67e39b418afe1a5d998ea0c1480e62a24f3fba154b"

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
