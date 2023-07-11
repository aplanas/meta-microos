SUMMARY = "Qt 6 WlShellIntegration library"
DESCRIPTION = "The Qt 6 WlShellIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WlShellIntegration6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "b3c97b3bfa8e14999c367e8f9dd18273e0dd8cd8097998b169d589d4ce4fa92a18ea2293d6d6b4aafa21c4b165b9854f0ea8250cea195fb29ab7ecc35f7b5d6c"

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
