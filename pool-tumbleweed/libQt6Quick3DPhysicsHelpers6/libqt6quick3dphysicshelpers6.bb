SUMMARY = "Qt 6 Quick3DPhysicsHelpers library"
DESCRIPTION = "The Qt 6 Quick3DPhysicsHelpers library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DPhysicsHelpers6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "e2ed8242ce9c4dae5c385e1615be44951405713fb2a3a7e0b7ed8d900dae87c88248baba19bbcd1d525a85db628f789ee880fa82dde7632b2cf66363cc74a71e"

RPROVIDES:${PN} += "libQt6Quick3DPhysicsHelpers.so.6()(64bit) \
libQt6Quick3DPhysicsHelpers.so.6(Qt_6)(64bit) \
libQt6Quick3DPhysicsHelpers6 \
libQt6Quick3DPhysicsHelpers6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick3D.so.6()(64bit) \
libQt6Quick3D.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
