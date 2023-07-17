SUMMARY = "Development files for the Qt 6 DesignerComponents library"
DESCRIPTION = "Development files for the Qt 6 DesignerComponents library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-designercomponents-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "f280e9253a961f131ab6653943b65c3e832e94549e65a630fdd891b6d789d3165c49887e308cdae8bebdc61b6a86680b7f8f32c5a615bf80be461b7f341b9ed2"

RPROVIDES:${PN} += "cmake-Qt6DesignerComponentsPrivate \
qt6-designercomponents-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
cmake-Qt6Xml \
libQt6DesignerComponents6 \
qt6-designer-private-devel \
qt6-gui-private-devel \
qt6-widgets-private-devel"

inherit rpm
