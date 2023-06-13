SUMMARY = "Qt 6 QuickControls2Impl library"
DESCRIPTION = "The Qt 6 QuickControls2Impl library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickControls2Impl6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "e010e73df8a1aa1ef2f34d7e7279d77cc552b55e12fd485c6e9c9a14736e06c7752758ba7b7c6ddc14b350ea0b99580f48517803ed28d4c3a447345adbc5ea79"

RPROVIDES:${PN} += "libQt6QuickControls2Impl.so.6()(64bit) \
libQt6QuickControls2Impl.so.6(Qt_6)(64bit) \
libQt6QuickControls2Impl6 \
libQt6QuickControls2Impl6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6QuickTemplates2.so.6()(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
