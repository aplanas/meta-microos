SUMMARY = "Qt 6 Quick3DUtils library"
DESCRIPTION = "The Qt 6 Quick3DUtils library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6Quick3DUtils6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "917e27b5d55bb2922bbf7019fb1465895fe0d3dfbb668f14151a3fbf19a231861d6f1cde09aa19e62c3bfad7c8b5a3d7d9a7e76c0cc36ced999342f466527676"

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
