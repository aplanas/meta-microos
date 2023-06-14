SUMMARY = "Qt 6 Quick3DAssetUtils library"
DESCRIPTION = "The Qt 6 Quick3DAssetUtils library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DAssetUtils6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "2fa75382cfae9d3673e0deca7bc3debdd15cc3b636ae3c20cd194e9f657b43e4fec344bd09924967c01a3e65561cffcb1b3a08ea3e98dca16da309628f897179"

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
