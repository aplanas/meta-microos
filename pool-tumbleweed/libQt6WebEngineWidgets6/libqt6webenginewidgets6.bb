SUMMARY = "Qt6 WebEngineWidgets library"
DESCRIPTION = "The Qt6 WebEngineWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6WebEngineWidgets6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "01b069f5d8defdcaa3b653ea64da31009516eb1e2acb3f70999886ffa5cecee371628af0f6b0193a40551b89e24d88d4060f88cf7b71117ea1f222a538442d29"

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
