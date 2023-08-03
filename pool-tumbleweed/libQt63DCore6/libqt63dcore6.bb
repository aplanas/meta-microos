SUMMARY = "Qt 6 3DCore library"
DESCRIPTION = "The Qt 6 3DCore library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt63DCore6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "4929220c887822bd295ae30882e4ca48eee92b45b12994c45cc250aa2bf0c26e5402d2ec604006699d17151b7e091fd0eb887369fc3588b7b5e85a4a4c832f98"

RPROVIDES:${PN} += "libQt63DCore.so.6 \
libQt63DCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
