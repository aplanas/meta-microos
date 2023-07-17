SUMMARY = "Qt 6 WlShellIntegration library - Development files"
DESCRIPTION = "Development files for the Qt 6 WlShellIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-wlshellintegration-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "f94800f04071c769c568eae726a18b7d88fd66b53913d702ab27c19fe4d0be8d4db43cd4affb36f0e85fe1fb5e55686d3cb33246f20db3e02311e1c119265874"

RPROVIDES:${PN} += "cmake-Qt6WlShellIntegrationPrivate \
qt6-wlshellintegration-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
cmake-Qt6WaylandClient \
libQt6WlShellIntegration6"

inherit rpm
