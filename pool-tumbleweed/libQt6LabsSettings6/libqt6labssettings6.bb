SUMMARY = "Qt 6 LabsSettings library"
DESCRIPTION = "The Qt 6 LabsSettings library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6LabsSettings6-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "2cbc589709bcce220321b9f1ccf23967fa7f7276c1cda553eb34d4469cc990c93aab4e31e4c85f8154383620d562be7b66e10dd0ead1529b32ab1f74fd5c1f9a"

RPROVIDES:${PN} += "libQt6LabsSettings.so.6 \
libQt6LabsSettings6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
