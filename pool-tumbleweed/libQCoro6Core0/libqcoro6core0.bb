SUMMARY = "Core library of qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides the core library."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "libQCoro6Core0-0.9.0-1.2.aarch64.rpm"
RPM_HASH = "9a6b46099f15a44de975f4418515a2c94d7bb009600200bc10d2584fda06a4758a3294d0e4e2b6f1267999714b37fc4cc54c0ea2e8e340f9ee1e47716e6e437b"

RPROVIDES:${PN} += "libQCoro6Core.so.0()(64bit) \
libQCoro6Core0 \
libQCoro6Core0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
