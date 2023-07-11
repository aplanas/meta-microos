SUMMARY = "Examples for the qt6-datavis3d modules"
DESCRIPTION = "Examples for the qt6-datavis3d modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavis3d-examples-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "dab31170984373c0f6bd99d635f19d9e82f1941795aa82efaf7d83ef1f7e42a9413878650841b37b931e230bb5d1c2cf5a07d48ff47050c27cc7ea15069725e0"

RPROVIDES:${PN} += "qt6-datavis3d-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DataVisualization.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
