SUMMARY = "Examples for the qt6-datavis3d modules"
DESCRIPTION = "Examples for the qt6-datavis3d modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-datavis3d-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "ecb9a24d06ad1b650bce20ad4908d7da053fc1b8b98b96472d6874cea24fd70bfaa5c027bb92b1aad214126d53650ab6549d400c3b8dd7fb30f8fefa7d675d91"

RPROVIDES:${PN} += "qt6-datavis3d-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DataVisualization.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
