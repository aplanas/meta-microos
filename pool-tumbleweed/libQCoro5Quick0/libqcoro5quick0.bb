SUMMARY = "Qt Quick support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for Qt Quick operations support."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "libQCoro5Quick0-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "0de4e7176fd5e4b7e832f92c2c086bee22ffb0573149ee0aa029ea79899fe5c3a051f0a8857411956d67794a71272503c09d69a36a09d9a6718d20a2172efe3d"

RPROVIDES:${PN} += "libQCoro5Quick.so.0 \
libQCoro5Quick0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
