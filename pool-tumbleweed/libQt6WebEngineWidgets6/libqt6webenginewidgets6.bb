SUMMARY = "Qt6 WebEngineWidgets library"
DESCRIPTION = "The Qt6 WebEngineWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6WebEngineWidgets6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "4cf4ddd689474e68bfe165397abaa7d1e1482cde6069d4612068734fe84e53afab49546379dd5d4eb11135c4c2239f6914854b79426ae588937f4de869739391"

RPROVIDES:${PN} += "libQt6WebEngineWidgets.so.6 \
libQt6WebEngineWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6WebEngineCore.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
