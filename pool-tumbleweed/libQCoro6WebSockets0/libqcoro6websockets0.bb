SUMMARY = "WebSockets support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for websockets support."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "libQCoro6WebSockets0-0.9.0-1.2.aarch64.rpm"
RPM_HASH = "75752dded4f9fccf1cfedb977fe9440ec44147e5b26b58474538827f94ae27687cc00abcf534676acfc5f074bef029d7855ee09569b292868bff6e6c9534b6d4"

RPROVIDES:${PN} += "libQCoro6WebSockets.so.0 \
libQCoro6WebSockets0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6WebSockets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
