SUMMARY = "Examples for the qt6-3d modules"
DESCRIPTION = "Examples for the qt6-3d modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3d-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "7cbe7be320d4ec041f1408e055aaaba62e6e04cc5291a241662eba2f7046476e1f1bd34f9d65a5b715d668c97ee60e1a242534b7bd3514cf199da51403b9ae3a"

RPROVIDES:${PN} += "qt6-3d-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt63DExtras.so.6 \
libQt63DQuick.so.6 \
libQt63DQuickExtras.so.6 \
libQt63DRender.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
