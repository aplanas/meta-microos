SUMMARY = "Qt Quick support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for Qt Quick operations support."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "libQCoro6Quick0-0.9.0-1.2.aarch64.rpm"
RPM_HASH = "5e517d11dad6ebb802b30b3eae8137323e80854d7d41cb06d3e08c39a20effa368ae8d47c73aaca073172671cd543c1a381d9213c6ba30bb74b042ab4b04b7d4"

RPROVIDES:${PN} += "libQCoro6Quick.so.0 \
libQCoro6Quick0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
