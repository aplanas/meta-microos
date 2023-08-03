SUMMARY = "Examples for the qt6-quick3dphysics modules"
DESCRIPTION = "Examples for the qt6-quick3dphysics modules."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dphysics-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e649f945614f4b3f928de8b00e092de735f1ec36f041354945fb0a9e8fe4c287eedc8f27d15c7bd733bb2b46b8869e0deae622f8c848dc1e4a5efad0a50645b5"

RPROVIDES:${PN} += "qt6-quick3dphysics-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
