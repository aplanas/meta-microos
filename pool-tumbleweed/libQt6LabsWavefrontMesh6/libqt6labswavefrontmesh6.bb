SUMMARY = "Qt 6 LabsWavefrontMesh library"
DESCRIPTION = "The Qt 6 LabsWavefrontMesh library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6LabsWavefrontMesh6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "e64a6b06cabbb2a1086de66820bb1afe0be883478e7b147aae0616e6d8e933b4c464493d1ba489ae1f01d97a087698fe9d40c64cd552942d51f96018b5d3c5a4"

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
