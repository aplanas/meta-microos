SUMMARY = "Qt 6 WlShellIntegration library"
DESCRIPTION = "The Qt 6 WlShellIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WlShellIntegration6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "ecb39b13fb40eb522ed0e08b48822ecee07c3a72fc0ca69597b3e633f5790df4c7b2c46ca706046c55dc2a3cb67a70331897c8826c1c600d03afa58830549fc5"

RPROVIDES:${PN} += "libQt6WlShellIntegration.so.6()(64bit) \
libQt6WlShellIntegration.so.6(Qt_6)(64bit) \
libQt6WlShellIntegration6 \
libQt6WlShellIntegration6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6WaylandClient.so.6()(64bit) \
libQt6WaylandClient.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwayland-client.so.0()(64bit)"

inherit rpm
