SUMMARY = "Qt 6 Quick3DHelpersImpl library"
DESCRIPTION = "The Qt 6 Quick3DHelpersImpl library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DHelpersImpl6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "a3f5be9161da063cec728c9a24676fdd489cd59a90c50e1cf55dd6b9566b0b2a68e03a603aa0112f64a5f59abc539d49fe9bb27c5f14ae8e4b98f6dc65e44257"

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
