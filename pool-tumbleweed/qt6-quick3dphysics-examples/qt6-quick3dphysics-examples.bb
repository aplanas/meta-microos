SUMMARY = "Examples for the qt6-quick3dphysics modules"
DESCRIPTION = "Examples for the qt6-quick3dphysics modules."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dphysics-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "9072e937d3a88c91f20f269d950e4534604d6a190a12fe4b39b3ce06235a47140c1faebb8bf0c2f66da7852106eecae3b8071474a052b1e5be481b6699510eb4"

RPROVIDES:${PN} += "qt6-quick3dphysics-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
