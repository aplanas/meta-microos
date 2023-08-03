SUMMARY = "Development files for the Qt 6 DesignerComponents library"
DESCRIPTION = "Development files for the Qt 6 DesignerComponents library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-designercomponents-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "1d0f83c1fbdd22e71dec6872a2cacdaa6f421194daed3208be3576d4b5ecddcea53e93105a8d77f6560251c2911fb904e9b3b096c8c980ee57b1d31d7b430b07"

RPROVIDES:${PN} += "cmake-Qt6DesignerComponentsPrivate \
qt6-designercomponents-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
cmake-Qt6Xml \
libQt6DesignerComponents6 \
qt6-designer-private-devel \
qt6-gui-private-devel \
qt6-widgets-private-devel"

inherit rpm
