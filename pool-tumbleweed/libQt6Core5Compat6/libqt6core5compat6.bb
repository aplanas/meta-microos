SUMMARY = "Qt 6 Core 5 Compat library"
DESCRIPTION = "The Qt 6 Core 5 Compat library"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6Core5Compat6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "3d96bc5d293a1ce775b60745c29538b9d0779b8758e3ca5eb7476d9769ab3292890e8e1bf149e07aee40d5299e5da653246ed32be978de01559c3be636886efc"

RPROVIDES:${PN} += "libQt6Core5Compat.so.6 \
libQt6Core5Compat6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libicuuc.so.73 \
libstdc++.so.6"

inherit rpm
