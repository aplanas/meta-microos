SUMMARY = "Qml support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for Qml operations support."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "libQCoro6Qml0-0.9.0-1.3.aarch64.rpm"
RPM_HASH = "f008c1ce447a905b8a2c5a7201ac6b416c913b4485204902f795b1fc190c66cb53be5af6e08ebba4708ecd5d979c359a5e09ac109dc32d17d70829354874ef83"

RPROVIDES:${PN} += "libQCoro6Qml.so.0 \
libQCoro6Qml0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
