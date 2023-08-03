SUMMARY = "Qt 6 WlShellIntegration library"
DESCRIPTION = "The Qt 6 WlShellIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6WlShellIntegration6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a5969d1d11f0d3afe9ccb1b457ae2baeb0041b0c90da1555160c1153dba6f561d7adba15127ddb35986c5c9e4c709570bc57d8e218bea77942966fd6e977990d"

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
