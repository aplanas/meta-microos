SUMMARY = "Qt 6 Quick3DUtils library"
DESCRIPTION = "The Qt 6 Quick3DUtils library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DUtils6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "573eeaa65ebec34d111bf714171034dc9fe71e9f7d3fc3898097813d6561233cfe5721d957c693eec035c2729592e9e69b3fe6c116b9053cec617eba51af9fe3"

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
