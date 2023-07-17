SUMMARY = "Qt 6 WlShellIntegration library"
DESCRIPTION = "The Qt 6 WlShellIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WlShellIntegration6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "cc9be9b36066022fbef343eea8100f93987208a9f518e137819d6f2420dba8649d8b0a32d20b2aad08e99e13181fffe26531988a6e8eba7253a39c5a1ed8f41c"

RPROVIDES:${PN} += "libQt6WlShellIntegration.so.6 \
libQt6WlShellIntegration6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6WaylandClient.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0"

inherit rpm
