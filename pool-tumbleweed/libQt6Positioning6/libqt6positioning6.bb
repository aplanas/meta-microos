SUMMARY = "Qt 6 Positioning library"
DESCRIPTION = "The Qt 6 Positioning library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Positioning6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "0f4d11cfd32489090a85031cb05ea5c89e8fccff9f2d09de784f6662e1ff6bba7e80acd90a6ac18faefb0646a15ce7b2cc7576fb9e26e322a4c5c2242e0ff528"

RPROVIDES:${PN} += "libQt6Positioning.so.6 \
libQt6Positioning6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
