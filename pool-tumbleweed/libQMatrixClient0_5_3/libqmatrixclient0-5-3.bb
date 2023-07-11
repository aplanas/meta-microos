SUMMARY = "Library for Qt Matrix Clients"
DESCRIPTION = "Library for Qt-based Matrix chat clients. It is required by \
Quaternion."
LICENSE = "LGPL-2.1-only"

PV = "0.5.3.2"

RPM_NAME = "libQMatrixClient0_5_3-0.5.3.2-1.18.aarch64.rpm"
RPM_HASH = "b9f27452b4933c98d78d53f64a7d6152a2be47e2da61240b32925912ba4a5b646e4b360de4c90ee0afd6bb4140195d1286d823c070d9f4a5ab2ed0f4ab53e7fa"

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
