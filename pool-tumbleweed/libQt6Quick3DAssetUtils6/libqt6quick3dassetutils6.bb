SUMMARY = "Qt 6 Quick3DAssetUtils library"
DESCRIPTION = "The Qt 6 Quick3DAssetUtils library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DAssetUtils6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "5f8bd246f808c1469e43c613cde8a478816e2cb66a26f4e307e9caaff3a8f4d685af6de859859a98ca6b1b99c9a8598b9b8673661f3b5acf9aa0b60b77dd8cb8"

RPROVIDES:${PN} += "libQt6Quick3DAssetUtils.so.6 \
libQt6Quick3DAssetUtils6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Quick3D.so.6 \
libQt6Quick3DAssetImport.so.6 \
libQt6Quick3DRuntimeRender.so.6 \
libQt6Quick3DUtils.so.6 \
libQt6QuickTimeline.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
