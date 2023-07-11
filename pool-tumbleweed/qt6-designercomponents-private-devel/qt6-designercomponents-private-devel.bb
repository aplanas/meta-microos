SUMMARY = "Development files for the Qt 6 DesignerComponents library"
DESCRIPTION = "Development files for the Qt 6 DesignerComponents library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-designercomponents-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "d18d89b5a1a79393e4405d0736c9d9c101c5783d1ea8eb95309a7bb9dcb8bb8218a70b7abff32d346701bce414ac640ba921724d645701497095ccc435282c91"

RPROVIDES:${PN} += "cmake-Qt6DesignerComponentsPrivate \
qt6-designercomponents-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
cmake-Qt6Xml \
libQt6DesignerComponents6 \
qt6-designer-private-devel \
qt6-gui-private-devel \
qt6-widgets-private-devel"

inherit rpm
