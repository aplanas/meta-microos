SUMMARY = "Qt 6 3DLogic library"
DESCRIPTION = "The Qt 6 3DLogic library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt63DLogic6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "0134b48a73e7d2377250750174bc2b8c5366049aff4d203eaf580c30241ff5960952962f5c17276cf2c3996c4aad69bd6de5f5a1c6b0c441884159a2a9eedacd"

RPROVIDES:${PN} += "libQt63DLogic.so.6 \
libQt63DLogic6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
