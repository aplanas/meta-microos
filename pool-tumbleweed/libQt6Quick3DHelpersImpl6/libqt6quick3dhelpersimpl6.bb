SUMMARY = "Qt 6 Quick3DHelpersImpl library"
DESCRIPTION = "The Qt 6 Quick3DHelpersImpl library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DHelpersImpl6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "a8855ce9462b57a0655abe86bbdd223d0976e5a0e71011a8a02bec2854482e41b3e34a8b3120712d76e49219c878e9e28f64fd29b71f16a19ae27fe952402e9c"

RPROVIDES:${PN} += "libQt6Quick3DHelpersImpl.so.6 \
libQt6Quick3DHelpersImpl6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Quick3D.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
