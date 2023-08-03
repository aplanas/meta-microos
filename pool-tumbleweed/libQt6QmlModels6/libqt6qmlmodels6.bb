SUMMARY = "Qt 6 QmlModels library"
DESCRIPTION = "The Qt 6 QmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6QmlModels6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "80e363501e36b33c7ca3959db81efaf4c4bc501c2ed579d410d1a904b278641956ef6968ee5bb8a23cbbc4e4a0687e0869cca74d8e30d1d9db7dd6a966bb1e51"

RPROVIDES:${PN} += "libQt6QmlModels.so.6 \
libQt6QmlModels6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
