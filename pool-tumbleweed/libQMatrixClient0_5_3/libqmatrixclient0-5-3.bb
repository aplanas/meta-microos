SUMMARY = "Library for Qt Matrix Clients"
DESCRIPTION = "Library for Qt-based Matrix chat clients. It is required by \
Quaternion."
LICENSE = "LGPL-2.1-only"

PV = "0.5.3.2"

RPM_NAME = "libQMatrixClient0_5_3-0.5.3.2-1.17.aarch64.rpm"
RPM_HASH = "b65f3372dbd9ec8138b08fedd25cbde0bea0dc5b9bc69c178cc4be6a39aad87ccdb53ff51c7c0d9a8cf1aba18763d02920f1dccb36a178ae037b19cdcc0e50ec"

RPROVIDES:${PN} += "libQMatrixClient.so.0.5.3 \
libQMatrixClient0-5-3"

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
