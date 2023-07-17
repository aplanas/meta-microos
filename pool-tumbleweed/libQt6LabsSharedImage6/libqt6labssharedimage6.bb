SUMMARY = "Qt 6 LabsSharedImage library"
DESCRIPTION = "The Qt 6 LabsSharedImage library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6LabsSharedImage6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "a65635527db8607c691ed752b145c8ea3095f83d25876eab172e2e3c627c481a87f38eeab65fda6b3f49d17ca6e18f523d135127451549bebde864793bc1ac4d"

RPROVIDES:${PN} += "libQt6LabsSharedImage.so.6 \
libQt6LabsSharedImage6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
