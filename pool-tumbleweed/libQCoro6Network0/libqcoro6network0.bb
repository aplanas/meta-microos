SUMMARY = "Network support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for network operations support."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "libQCoro6Network0-0.9.0-1.2.aarch64.rpm"
RPM_HASH = "c4a505d872fe33166efaa80d4467001b5cf68869bc6fa4153fa1a98d8e8d00c826d8e42ab2f91ef4048a084b430212750a8b60200ecc5da8360edc2a7a43b093"

RPROVIDES:${PN} += "libQCoro6Network.so.0()(64bit) \
libQCoro6Network0 \
libQCoro6Network0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQCoro6Core.so.0()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
