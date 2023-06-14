SUMMARY = "JsonRpc 2.0 protocol implementation"
DESCRIPTION = "JsonRpc 2.0 protocol implementation for Qt6."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6JsonRpc6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "974464eb130115bd85dc330e9a0dfbbb07ae40d8a2ac74164a29b1bc64ead67b491a92a99f31c6c3cd77b5afd184d0a826b5a75135b33faea38332a56501e538"

RPROVIDES:${PN} += "libQt6JsonRpc.so.6 \
libQt6JsonRpc6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
