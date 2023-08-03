SUMMARY = "Qt 6 3DQuickInput library"
DESCRIPTION = "The Qt 6 3DQuickInput library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt63DQuickInput6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "39e20557fe00012b2f00562e68f4056b41ca4c5524d5233d08cf634ed632f34283deee561c911e616a823a3a1c2b3916908bc38d6de05104d28739e656b81d8b"

RPROVIDES:${PN} += "libQt63DQuickInput.so.6 \
libQt63DQuickInput6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt63DInput.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
