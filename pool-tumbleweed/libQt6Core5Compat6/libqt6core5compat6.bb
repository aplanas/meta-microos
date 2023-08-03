SUMMARY = "Qt 6 Core 5 Compat library"
DESCRIPTION = "The Qt 6 Core 5 Compat library"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6Core5Compat6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "1a916c1283e0991ab567e97712e883a6fae701d70f440759114961bf5551dd22963e5f2d405375a05580199627be1edc11640fef5513dd387d6e2c90ae0c59ba"

RPROVIDES:${PN} += "libQt6Core5Compat.so.6 \
libQt6Core5Compat6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libicuuc.so.73 \
libstdc++.so.6"

inherit rpm
