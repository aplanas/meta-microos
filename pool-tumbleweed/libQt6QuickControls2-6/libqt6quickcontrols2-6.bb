SUMMARY = "Qt 6 QuickControls2 library"
DESCRIPTION = "The Qt 6 QuickControls2 library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6QuickControls2-6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "da93d5cc4b381c9e857398d25153a9888a75aaf4e494d1361638ed4e0fc226a3bbada8e8323396bb19e7f8af2bd6a49bfae2b537ea0bc9286efb949369c230ed"

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
