SUMMARY = "WebSockets support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for websockets support."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "libQCoro6WebSockets0-0.9.0-1.3.aarch64.rpm"
RPM_HASH = "2ca3d500485401cdd63cf308145e2fd9d3702934c65a93111dec91686a110b3ff0696e3917ffc915500e102dc249614ac8ccc0eb4a3006d8a4985dd1862a93b5"

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
