SUMMARY = "Qt 6 Quick3DPhysicsHelpers library"
DESCRIPTION = "The Qt 6 Quick3DPhysicsHelpers library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DPhysicsHelpers6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "655901111b282dec2fa4dd079b50fdbfec9325f8e471ca72c277670f3cb9b8832326acdb964cb1197f0ebc0ebbab5fbc0fcd3be35044e889261ab111b4b203df"

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
