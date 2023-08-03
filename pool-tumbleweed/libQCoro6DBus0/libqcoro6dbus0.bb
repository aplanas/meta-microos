SUMMARY = "DBus support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for D-Bus support."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "libQCoro6DBus0-0.9.0-1.3.aarch64.rpm"
RPM_HASH = "8b3dc73659644fd4da85333cc920b81c26a0161950bfd54440c982dcaf5eff954c1f93fdd1e61fdedbb5e63f4e4436abcfbe8112cd8d013995b083d8db453e9e"

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
