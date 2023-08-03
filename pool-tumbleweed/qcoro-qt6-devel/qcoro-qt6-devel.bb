SUMMARY = "Development files for qcoro"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 coroutines \
in connection with certain asynchronous Qt actions. \
This package provides development headers to use QCoro in Qt based \
applications."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "qcoro-qt6-devel-0.9.0-1.3.aarch64.rpm"
RPM_HASH = "84e91e9524e90578c493df317e9c8bedcde63358fb211c1beeb6a6e08d3a5cf18bf0a957e64f04a603679ffc402062f6d6f8dc11e7f443f3f79ec9b5fb4945c0"

RPROVIDES:${PN} += "cmake-QCoro6 \
cmake-QCoro6Core \
cmake-QCoro6Coro \
cmake-QCoro6DBus \
cmake-QCoro6Network \
cmake-QCoro6Qml \
cmake-QCoro6Quick \
cmake-QCoro6Test \
cmake-QCoro6WebSockets \
qcoro-qt6-devel"

RDEPENDS:${PN} += "libQCoro6Core0 \
libQCoro6DBus0 \
libQCoro6Network0 \
libQCoro6Qml0 \
libQCoro6Quick0 \
libQCoro6WebSockets0"

inherit rpm
