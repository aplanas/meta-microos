SUMMARY = "QML imports for the Qt5 WebSockets library"
DESCRIPTION = "The module provides a JavaScript library for seamless integration of \
C++ and QML applications with HTML/JavaScript and QML clients."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde3"

RPM_NAME = "libQt5WebChannel5-imports-5.15.9+kde3-1.1.aarch64.rpm"
RPM_HASH = "bab1515d2fc4687ed0390a5a7312beceb37daf41f6e5dc56135f42648b4dc21939d481233b58232cc9db320bd36ee495b719554988d1a31bfbc5ebbc13921df5"

RPROVIDES:${PN} += "libQt5WebChannel5-imports \
libQt5WebChannel5-imports(aarch-64) \
libdeclarative_webchannel.so()(64bit) \
qt5qmlimport(QtWebChannel.1)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5WebChannel.so.5()(64bit) \
libQt5WebChannel.so.5(Qt_5)(64bit) \
libQt5WebChannel.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQtQuick5 \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
