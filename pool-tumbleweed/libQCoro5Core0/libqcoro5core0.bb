SUMMARY = "Core library of qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides the core library."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "libQCoro5Core0-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "ecc72df969ec0917c3920f44a8c063a9c1e9188a1612b902dfd9d9853f922c3fe438244d70b52d03ce471bdfc60c9e9ccfb6c52e366ffe325b461b372bb08100"

RPROVIDES:${PN} += "libQCoro5Core.so.0 \
libQCoro5Core0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
