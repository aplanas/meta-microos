SUMMARY = "Qt 6 QuickLayouts library"
DESCRIPTION = "The Qt 6 QuickLayouts library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6QuickLayouts6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "208bfee135436570ef4191f1a68ec07086609968d0a5024dbb25af83ff9cb30c944318c244f8cdab87aeb03bc8e79d8ef7dc149091c7cb30821067c09df68243"

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
