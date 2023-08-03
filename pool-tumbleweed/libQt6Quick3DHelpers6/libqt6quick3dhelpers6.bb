SUMMARY = "Qt 6 Quick3DHelpers library"
DESCRIPTION = "The Qt 6 Quick3DHelpers library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6Quick3DHelpers6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "7ff4fffe3963b4f3eaf256af17bef9bb758ea1249a6c56ab991a56a3d631aa1a4f4ef0840a6e8677ec8808310546bba394fb26e017774f8c8aff5b6e4ff3a373"

RPROVIDES:${PN} += "libQt6Quick3DHelpers.so.6 \
libQt6Quick3DHelpers6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick3D.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
