SUMMARY = "Qt6 WebEngineWidgets library"
DESCRIPTION = "The Qt6 WebEngineWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6WebEngineWidgets6-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "8d8bd0be86224645004949a4debc94cb19d6dd30edab8c48ae232be78c844f6f42b168b9d580121441044fc25742e893203da57feba5c522dcb822303ddb8f9a"

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
