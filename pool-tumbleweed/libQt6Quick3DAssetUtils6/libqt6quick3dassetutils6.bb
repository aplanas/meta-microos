SUMMARY = "Qt 6 Quick3DAssetUtils library"
DESCRIPTION = "The Qt 6 Quick3DAssetUtils library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6Quick3DAssetUtils6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "d8a7aabf5f99c1bb2248290c10457fc9195a75a820f91122758876a22042c731b292645652fd1fc377b953c24f302aa43cf9c0e0245d690f10324c7d56b64b21"

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
