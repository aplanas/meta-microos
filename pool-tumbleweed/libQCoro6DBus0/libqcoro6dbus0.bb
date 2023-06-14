SUMMARY = "DBus support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for D-Bus support."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "libQCoro6DBus0-0.9.0-1.2.aarch64.rpm"
RPM_HASH = "2788e5bfde7ade1d8e81ee8078462c407fa9512689dd6eb4a6d1e15c31e063436569b95347af004ea99ce924419d67fff3e65ac54c2aab0969f5352d0a351c75"

RPROVIDES:${PN} += "libQCoro6DBus.so.0 \
libQCoro6DBus0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
