SUMMARY = "Qt 6 Quick3DAssetUtils library"
DESCRIPTION = "The Qt 6 Quick3DAssetUtils library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DAssetUtils6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "0edb57d08aba2760f54d29157de3aed2627f4fb38dcb0c382166438b57fdd148da68ba93f1f25d5617902279e24d1295765f90572d7bd589d97613ead119e989"

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
