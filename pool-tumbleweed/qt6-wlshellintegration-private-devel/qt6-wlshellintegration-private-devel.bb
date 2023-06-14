SUMMARY = "Qt 6 WlShellIntegration library - Development files"
DESCRIPTION = "Development files for the Qt 6 WlShellIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-wlshellintegration-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "7ca3968fddac44ffda54afd68979b022f316ca8e81c0fbcf6adc58fca9c64c4be28c2986e09687f67854961f6e6e67abd42027a8a94c3778ee9be576fa3a0377"

RPROVIDES:${PN} += "cmake-Qt6WlShellIntegrationPrivate \
qt6-wlshellintegration-private-devel"

RDEPENDS:${PN} += "libQt6WlShellIntegration6 \
qt6-gui-private-devel \
qt6-waylandclient-private-devel"

inherit rpm
