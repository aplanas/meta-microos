SUMMARY = "Qt 6 Quick3DUtils library"
DESCRIPTION = "The Qt 6 Quick3DUtils library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DUtils6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0f18bfd8964e42a066aeced64355f3bbe4affe9d1ea90216355fdb356a24460d38fbc8cc401964a24921c490583137e37789f2860d77c14c622819e4f6166d2a"

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
