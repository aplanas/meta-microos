SUMMARY = "Qt 6 Quick3D library"
DESCRIPTION = "The Qt 6 Quick3D library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6Quick3D6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "c4516a94d8dc54091b5fc32467a3c4cd8fab32e30b29d958da2efb5489ae27416b00d099d6d111456765ab1aad9d1c6184b3ce9f336da83bfee4878f7a69a923"

RPROVIDES:${PN} += "libQt6Quick3D.so.6 \
libQt6Quick3D6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QmlModels.so.6 \
libQt6Quick.so.6 \
libQt6Quick3DRuntimeRender.so.6 \
libQt6Quick3DUtils.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
