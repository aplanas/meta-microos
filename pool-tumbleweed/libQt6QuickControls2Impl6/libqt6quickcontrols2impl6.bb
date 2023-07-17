SUMMARY = "Qt 6 QuickControls2Impl library"
DESCRIPTION = "The Qt 6 QuickControls2Impl library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickControls2Impl6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "0866766a02b515039f3b62a6754273d93969949f1dea9660012f6943e13fade464680f28e2be795414f5189165631a1d3191eff8926f690e0eae5a085763919b"

RPROVIDES:${PN} += "libQt6QuickControls2Impl.so.6 \
libQt6QuickControls2Impl6"

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
