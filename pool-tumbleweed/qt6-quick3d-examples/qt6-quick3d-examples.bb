SUMMARY = "Examples for the qt6-quick3d modules"
DESCRIPTION = "Examples for the qt6-quick3d modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3d-examples-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "3f8f20f2aa7cd58465ddc6f6a01ec7bb09fb6bcdf5c21b61ff1f17b2937a8720c5d9fdfdbf329627c6702ae1672c3b6fe934c6e755ad2c2bfe916040ec761939"

RPROVIDES:${PN} += "qt6-quick3d-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Quick3D.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
