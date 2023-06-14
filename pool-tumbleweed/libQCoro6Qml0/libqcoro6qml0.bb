SUMMARY = "Qml support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for Qml operations support."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "libQCoro6Qml0-0.9.0-1.2.aarch64.rpm"
RPM_HASH = "94b45ae858f21a847617294836f8cfeab781014072ae2afc3e828297c3872baf0230e9b3026c8700ff1a9c9e2246e8b1fa9214b1042b364b1d75f3383af8ccf7"

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
