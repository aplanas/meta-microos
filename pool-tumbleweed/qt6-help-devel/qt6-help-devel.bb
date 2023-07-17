SUMMARY = "Qt 6 Help library - Development files"
DESCRIPTION = "Development files for the Qt6 Help library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-help-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "197b76bdb35765005cb6a7e0bb90efd071fe617d55e4bec024587315b7e90829a1d43debc5227c15acde02871bf4a9e8f007820d799e22163bcfe3a8a51e26f3"

RPROVIDES:${PN} += "cmake-Qt6Help \
pkgconfig-Qt6Help \
qt6-help-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Network \
cmake-Qt6Sql \
cmake-Qt6Widgets \
libQt6Help6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Sql \
pkgconfig-Qt6Widgets"

inherit rpm
