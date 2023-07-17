SUMMARY = "Qt 6 Quick3DUtils library"
DESCRIPTION = "The Qt 6 Quick3DUtils library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DUtils6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "e21e4569726821ccd0580ed397e40170c97ca8c8b900de0ced2c397aee34bc24dce38098b8d308902365cf84bf8210d6e0b51016d1d83d252af42243eca2ae07"

RPROVIDES:${PN} += "libQt6Quick3DUtils.so.6 \
libQt6Quick3DUtils6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
