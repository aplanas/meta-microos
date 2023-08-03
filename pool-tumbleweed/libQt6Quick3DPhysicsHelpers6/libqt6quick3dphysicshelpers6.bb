SUMMARY = "Qt 6 Quick3DPhysicsHelpers library"
DESCRIPTION = "The Qt 6 Quick3DPhysicsHelpers library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6Quick3DPhysicsHelpers6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "b6a60eed935138692df9b3160c1e9759dd4d1f1763cdf3e2d6204daa17921c4c8b83512076707ea15f7cfd36047499ac3cfcd4b7ee1e0c84656ab46f856708e4"

RPROVIDES:${PN} += "libQt6Quick3DPhysicsHelpers.so.6 \
libQt6Quick3DPhysicsHelpers6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Quick3D.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
