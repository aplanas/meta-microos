SUMMARY = "Library for Qt Matrix Clients"
DESCRIPTION = "Library for Qt-based Matrix chat clients. It is required by \
Quaternion."
LICENSE = "LGPL-2.1-only"

PV = "0.8.1.1"

RPM_NAME = "libQuotient0_8-0.8.1.1-1.1.aarch64.rpm"
RPM_HASH = "6a6ccd779c7a4a246621b73090f8c12e025f9c9cf7d8c158123904ff4946c5efe0d1b4ef438ad802f9e404a9a015f748908a6402a5b965a47e40d7a53a7964d9"

RPROVIDES:${PN} += "libQuotient.so.0.8 \
libQuotient0-8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libolm.so.3 \
libqt5keychain.so.1 \
libstdc++.so.6"

inherit rpm
