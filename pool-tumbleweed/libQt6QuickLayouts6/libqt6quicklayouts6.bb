SUMMARY = "Qt 6 QuickLayouts library"
DESCRIPTION = "The Qt 6 QuickLayouts library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6QuickLayouts6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "75a1e86917bc4018b1ff5ce64dd50b3f2d5132362dd963e6ab19086ae82f1d556b94875ba8f220a51cdc8aabc3e8c0954f48b8aa22b44bedc173863e314bf1e5"

RPROVIDES:${PN} += "libQt6QuickLayouts.so.6 \
libQt6QuickLayouts6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
