SUMMARY = "Qt 6 QuickDialogs2Impl library"
DESCRIPTION = "The Qt 6 QuickDialogs2Impl library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickDialogs2QuickImpl6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "deb870c2467778a64d8e7d1e36c140d48f5d940b5bd060ed01162755339883bef627c118f2f3880280fc901f2d1ced6d1f2181db807feb77a914122d72403bf8"

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
