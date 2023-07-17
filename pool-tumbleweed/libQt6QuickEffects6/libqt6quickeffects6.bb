SUMMARY = "Qt 6 QuickEffects library"
DESCRIPTION = "The Qt 6 QuickEffects library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickEffects6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "368befc37f15c6cc45d833bd0c4ebf06d722349d6ffc2c026679ef6ee7f64199fe6535bc106346113ad0ec99e050b0fd79ba8d51847447a8faec06b2ea7f74cc"

RPROVIDES:${PN} += "libQt6QuickEffects.so.6 \
libQt6QuickEffects6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
