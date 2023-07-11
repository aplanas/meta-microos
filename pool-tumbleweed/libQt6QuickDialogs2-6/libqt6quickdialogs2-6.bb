SUMMARY = "Qt 6 QuickDialogs2 library"
DESCRIPTION = "The Qt 6 QuickDialogs2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickDialogs2-6-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "32a474667b72521a178b767c1a81a23c603b9051d2111701eaba7742aec621aa0c7a36821f35ee92784f61b67901af46c2fea8a5eccfa9f31f1a718e7359f8ad"

RPROVIDES:${PN} += "libQt6QuickDialogs2-6 \
libQt6QuickDialogs2.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickDialogs2QuickImpl.so.6 \
libQt6QuickDialogs2Utils.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
