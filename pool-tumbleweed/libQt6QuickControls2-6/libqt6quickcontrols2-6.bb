SUMMARY = "Qt 6 QuickControls2 library"
DESCRIPTION = "The Qt 6 QuickControls2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickControls2-6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "ad61e4bfc85ecaeb222536d09413a540cdad409fd91d0b320967457279a69e2ec5bce275bd09dc370bd3d24742240ac23e50145ad7264c3a409184a8bf415f64"

RPROVIDES:${PN} += "libQt6QuickControls2-6 \
libQt6QuickControls2.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickTemplates2.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
