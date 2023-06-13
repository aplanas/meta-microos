SUMMARY = "Qt 6 QuickDialogs2 library"
DESCRIPTION = "The Qt 6 QuickDialogs2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickDialogs2-6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "243399fcd1897f1e157dd40563072422d9a40f04c64f5461f96516bb369442b0cb615f6b6d42e6c5989e1a8e0a3bea6756e2002d7917121fab81b207ea13306f"

RPROVIDES:${PN} += "libQt6QuickDialogs2-6 \
libQt6QuickDialogs2-6(aarch-64) \
libQt6QuickDialogs2.so.6()(64bit) \
libQt6QuickDialogs2.so.6(Qt_6)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6QuickDialogs2QuickImpl.so.6()(64bit) \
libQt6QuickDialogs2Utils.so.6()(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
