SUMMARY = "Qt Quick support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for Qt Quick operations support."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "libQCoro6Quick0-0.9.0-1.3.aarch64.rpm"
RPM_HASH = "13ad928776c6402c6b508aba7b75cddd9b2378e4b06acf5765f8d580b3c0e6d83960893cb9c80c1bde002c3612b6045be6f25751ee341882103240a85bd60355"

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
