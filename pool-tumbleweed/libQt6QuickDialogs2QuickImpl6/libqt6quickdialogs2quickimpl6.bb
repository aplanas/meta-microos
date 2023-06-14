SUMMARY = "Qt 6 QuickDialogs2Impl library"
DESCRIPTION = "The Qt 6 QuickDialogs2Impl library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickDialogs2QuickImpl6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "e981e676c33f67cc83ed62cc90f8677e1395d6b992c035f6237af7f1a22a0e6cb2bcd93ae1be7402a11a51093b96481045211a30605a9756701a88404f2d5aa2"

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
