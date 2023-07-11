SUMMARY = "Qt 6 Core 5 Compat library"
DESCRIPTION = "The Qt 6 Core 5 Compat library"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6Core5Compat6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "f98d697dcfae5f0b2dc56ede84566d2a101009f11a513a3c472cbf544b30d48690972f44124053f05c154bf3f7bd61bde61a992db906698223e7945bd7120052"

RPROVIDES:${PN} += "libQt6Core5Compat.so.6 \
libQt6Core5Compat6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libicuuc.so.73 \
libstdc++.so.6"

inherit rpm
