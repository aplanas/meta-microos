SUMMARY = "Qt 6 QuickEffects library"
DESCRIPTION = "The Qt 6 QuickEffects library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6QuickEffects6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "7a68f23334a21ece3ff74b85621f6c56674d21e28a67434c3e07f1851e5cbe372da27a4ee34bc9d438d84860fd8029e5fcee2a79aef9232a15ac3e49439b543d"

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
