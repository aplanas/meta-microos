SUMMARY = "Qt 6 3DQuickInput library"
DESCRIPTION = "The Qt 6 3DQuickInput library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DQuickInput6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "e30c7b56cb44dbd92fd28dd4bd2124a5c86f36e749d72e39fd5b657e03c0966cadfd8bb19fa21a4f313782f665e4e6b40fb25a1ba58807e11d9781582ab01fe6"

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
