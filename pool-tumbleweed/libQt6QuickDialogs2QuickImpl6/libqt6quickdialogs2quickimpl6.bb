SUMMARY = "Qt 6 QuickDialogs2Impl library"
DESCRIPTION = "The Qt 6 QuickDialogs2Impl library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6QuickDialogs2QuickImpl6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "a7cea46622c9463585f848cc0c76bcaec811dd4728629c859e7e3bfa9901b7f63db126edee38a7ba97257954480c3e786c993fded9098562a452877e28647118"

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
