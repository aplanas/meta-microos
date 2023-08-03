SUMMARY = "Qt 6 WlShellIntegration library - Development files"
DESCRIPTION = "Development files for the Qt 6 WlShellIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-wlshellintegration-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "792b508f0ac99766cbfebe721ea1d3aed86a10b7e908f1a750a0c3c7b935f95a84541887374d07768793b5c19f425007992b10230454c8db25f855b58514c96e"

RPROVIDES:${PN} += "cmake-Qt6WlShellIntegrationPrivate \
qt6-wlshellintegration-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
cmake-Qt6WaylandClient \
libQt6WlShellIntegration6"

inherit rpm
