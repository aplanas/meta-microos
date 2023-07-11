SUMMARY = "Library for Qt Matrix Clients"
DESCRIPTION = "Library for Qt-based Matrix chat clients. It is required by \
Quaternion."
LICENSE = "LGPL-2.1-only"

PV = "0.6.11"

RPM_NAME = "libQuotient0_6-0.6.11-2.4.aarch64.rpm"
RPM_HASH = "1433a14291c2fbefa1d8ebe284c617c59db48b5e9a0e7ddb059eafef4820c108ddcfd5e7f8982150fc5d40030d2658fe567a07b864eeacd2368c450ad92ffeba"

RPROVIDES:${PN} += "libQuotient.so.0.6 \
libQuotient0-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
