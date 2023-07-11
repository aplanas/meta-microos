SUMMARY = "Qt 6 WlShellIntegration library - Development files"
DESCRIPTION = "Development files for the Qt 6 WlShellIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-wlshellintegration-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "2fb1d13e2404665344a8b01f3562a27a38753fabb75e374f3e140bc9a4c3444e8dc9f403ec6e96e9ce7ceda6d7fb2d1c31b8c0ff603c381806575044d01f4f9c"

RPROVIDES:${PN} += "cmake-Qt6WlShellIntegrationPrivate \
qt6-wlshellintegration-private-devel"

RDEPENDS:${PN} += "libQt6WlShellIntegration6 \
qt6-gui-private-devel \
qt6-waylandclient-private-devel"

inherit rpm
