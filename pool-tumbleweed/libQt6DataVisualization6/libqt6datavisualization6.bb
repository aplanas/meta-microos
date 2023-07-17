SUMMARY = "Qt 6 DataVisualization library"
DESCRIPTION = "The Qt 6 DataVisualization library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6DataVisualization6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "e6624044fad7064d48727b19be23a33c850473dad42b3580c19a10a6c3c95c390f452bfe9b90c65417b4dd0cca7b5aa6db0d26f0cf7e9fe573ad8c22a7b6d30f"

RPROVIDES:${PN} += "libQt6DataVisualization.so.6 \
libQt6DataVisualization6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
