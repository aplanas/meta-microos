SUMMARY = "Qt 6 Quick3DHelpersImpl library"
DESCRIPTION = "The Qt 6 Quick3DHelpersImpl library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6Quick3DHelpersImpl6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "ceae8ac9f3cb67f22fbbeca63f66aa41a823dcd6d0f64266afa632b219c557a00505a458adec521565adcca230ca1abfa5639d36f572f1a00759c259b8ffd537"

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
