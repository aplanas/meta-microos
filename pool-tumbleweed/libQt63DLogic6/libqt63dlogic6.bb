SUMMARY = "Qt 6 3DLogic library"
DESCRIPTION = "The Qt 6 3DLogic library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DLogic6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "928899cc3a4fbafc94455f5be6ed37a9bff07788b55d92b80ad8951dfbc6227223116355b576843542159ec67f94f7d87ab7f6057643459d6a511502ef30350e"

RPROVIDES:${PN} += "libQt63DLogic.so.6 \
libQt63DLogic6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
