SUMMARY = "Development files for the Qt 6 Widgets library"
DESCRIPTION = "Development files for the Qt 6 Widgets library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-widgets-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "aa1046594dd1e343a442aa92afa881e52185a98eb1875a003fd2224e5af43d93e7272de03cb665e4b74529ee77c49f0b7d40c4090cd70d604f50ac3a431bbea0"

RPROVIDES:${PN} += "cmake(Qt6Widgets) \
cmake(Qt6WidgetsTools) \
pkgconfig(Qt6Widgets) \
qt6-widgets-devel \
qt6-widgets-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Core) \
cmake(Qt6Gui) \
libQt6Widgets6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui)"

inherit rpm
