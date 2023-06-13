SUMMARY = "The library for the Database Connectivity and Creation Framework"
DESCRIPTION = "The library for the database connectivity and creation framework for various database vendors"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "libKDb3-4-3.2.0-7.17.aarch64.rpm"
RPM_HASH = "3e9fca2444e3e80c1d0c5aacc9aa92e533c9fbdba5ab3478558ea72b73e4f8b5b6f7863ed628c57343d10376e736dabb210ffd1c9a780793e53cb8e668464bf8"

RPROVIDES:${PN} += "kdb \
libKDb3-4 \
libKDb3-4(aarch-64) \
libKDb3.so.4()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libicui18n.so.73()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit)"

inherit rpm
