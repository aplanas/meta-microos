SUMMARY = "Deepin Wayland Server"
DESCRIPTION = "DDE wayland server library with DDE custom protocol."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "libdde-wayland-server0-1.0.0-1.12.aarch64.rpm"
RPM_HASH = "9aaf22b957210677f32a93ba8ae25ae21545392e1b9d9b8102219963b868aabd48b707aa3afb35819cb340da66c97a22eaee7f43ba09272f3b8f106af2a7deb8"

RPROVIDES:${PN} += "libdde-wayland-server.so.0 \
libdde-wayland-server0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5WaylandCompositor.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwayland-server.so.0"

inherit rpm
