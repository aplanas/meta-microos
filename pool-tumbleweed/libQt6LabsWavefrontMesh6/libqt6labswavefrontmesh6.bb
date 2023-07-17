SUMMARY = "Qt 6 LabsWavefrontMesh library"
DESCRIPTION = "The Qt 6 LabsWavefrontMesh library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6LabsWavefrontMesh6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "d4834b9d41cd5e41ba952f1f4fe87538283a525f52daf542a6ff50971946624470273dbfbd07751cae4a106ae9f27c612fed9c87181a3c05a9f0ddcfda42f619"

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
