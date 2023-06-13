SUMMARY = "Development files for the Qt 6 DesignerComponents library"
DESCRIPTION = "Development files for the Qt 6 DesignerComponents library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-designercomponents-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "1efe68a3dfd476e6457aee9ca2a603df09b8b0591e1165fbd39c05579b7d47e68d917ff55080758bedf8ca834bad28fad1264b7cc45a677f32c1fb20c29b3244"

RPROVIDES:${PN} += "cmake(Qt6DesignerComponentsPrivate) \
qt6-designercomponents-private-devel \
qt6-designercomponents-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6Core) \
cmake(Qt6Xml) \
libQt6DesignerComponents6 \
qt6-designer-private-devel \
qt6-gui-private-devel \
qt6-widgets-private-devel"

inherit rpm
