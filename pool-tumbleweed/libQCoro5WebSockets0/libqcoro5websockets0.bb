SUMMARY = "WebSockets support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for websockets support."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "libQCoro5WebSockets0-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "2f66f05b289463544089d3854b50f0a94ea1f3269c64542882bd3e7c750d4d41558b4432493241410cf86473216a6bc740496768f7bc4ba30e3fa330776144c2"

RPROVIDES:${PN} += "libQCoro5WebSockets.so.0()(64bit) \
libQCoro5WebSockets0 \
libQCoro5WebSockets0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5WebSockets.so.5()(64bit) \
libQt5WebSockets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
