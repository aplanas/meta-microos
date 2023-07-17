SUMMARY = "Examples for the qt6-quick3dphysics modules"
DESCRIPTION = "Examples for the qt6-quick3dphysics modules."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dphysics-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "c00f5d8d687563385c2a62698cd045e1734b8eedf008bf3964aea4d24f909f91d0cd94a6b95b74ea04f5a597567d9c7b9ab8649d683bee1411d141b403cbd8a2"

RPROVIDES:${PN} += "qt6-quick3dphysics-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
