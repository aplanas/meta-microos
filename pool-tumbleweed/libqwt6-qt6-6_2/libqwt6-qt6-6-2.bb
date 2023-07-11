SUMMARY = "Shared library for Qt6 Widgets for Technical Applications"
DESCRIPTION = "This package contains the shared library to run Technical Applications \
developed with/for Qwt(Qt5)."
LICENSE = "SUSE-QWT-1.0"

PV = "6.2.0"

RPM_NAME = "libqwt6-qt6-6_2-6.2.0-2.2.aarch64.rpm"
RPM_HASH = "ddccfb80d9c6b5b9ed051cae495d7fa17ca890e42e9d4a870a478c527c985a3d2a0dd98aed394e2dc93e77d0cd67ec520bab7d3b68f286d147413adda3ace5ad"

RPROVIDES:${PN} += "libqwt-qt6.so.6.2 \
libqwt6-qt6-6-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
