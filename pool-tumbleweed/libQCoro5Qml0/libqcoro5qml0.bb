SUMMARY = "Qml support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for Qml operations support."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "libQCoro5Qml0-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "2a0c4380804a16501bff74e99dc46caeeee43376be18bcb21939ff7d2ae05c633e1a47716195f3846f35df592d1a8898c146fc7adc786df9952bba2c66de1864"

RPROVIDES:${PN} += "libQCoro5Qml.so.0 \
libQCoro5Qml0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
