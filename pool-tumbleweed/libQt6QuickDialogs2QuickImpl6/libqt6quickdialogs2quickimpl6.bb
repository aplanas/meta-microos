SUMMARY = "Qt 6 QuickDialogs2Impl library"
DESCRIPTION = "The Qt 6 QuickDialogs2Impl library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6QuickDialogs2QuickImpl6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "f72239179abfc2380bdd9cc6f87b8363ece43f0c79c2626dde566e36abbb2a0ad1afb019e64d3f9b9a8051c4d25e300d2407cef829d9d487e96c971c3256927e"

RPROVIDES:${PN} += "libQt6QuickDialogs2QuickImpl.so.6 \
libQt6QuickDialogs2QuickImpl6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2Impl.so.6 \
libQt6QuickDialogs2Utils.so.6 \
libQt6QuickTemplates2.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
