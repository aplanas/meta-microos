SUMMARY = "Core library of qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides the core library."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "libQCoro6Core0-0.9.0-1.3.aarch64.rpm"
RPM_HASH = "dd5ba75e8435fc4ea79010619c401f2b71ca27583638bf6cad730b2b649c9af5473d4d6d1261913ba1abcf898161d236c43b9ee96e9440188bc173619a2dfe67"

RPROVIDES:${PN} += "libQCoro6Core.so.0 \
libQCoro6Core0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
