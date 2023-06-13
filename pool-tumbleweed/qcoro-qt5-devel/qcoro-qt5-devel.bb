SUMMARY = "Development files for qcoro"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 coroutines \
in connection with certain asynchronous Qt actions. \
This package provides development headers to use QCoro in Qt based \
applications."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "qcoro-qt5-devel-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "fbf334c9699e5aaf3ea27139499967a6fe767b71e631d0207c77d2031eba229b75f89623b2f69c4cdff67917ab2dc861550711c2a27e47f087866a7f0cbdf8ce"

RPROVIDES:${PN} += "cmake(QCoro5) \
cmake(QCoro5Core) \
cmake(QCoro5Coro) \
cmake(QCoro5DBus) \
cmake(QCoro5Network) \
cmake(QCoro5Qml) \
cmake(QCoro5Quick) \
cmake(QCoro5Test) \
cmake(QCoro5WebSockets) \
qcoro-qt5-devel \
qcoro-qt5-devel(aarch-64)"

RDEPENDS:${PN} += "libQCoro5Core0 \
libQCoro5DBus0 \
libQCoro5Network0 \
libQCoro5Qml0 \
libQCoro5Quick0 \
libQCoro5WebSockets0"

inherit rpm
