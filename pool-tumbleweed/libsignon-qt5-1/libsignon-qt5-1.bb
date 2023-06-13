SUMMARY = "Single Sign On Framework for Qt"
DESCRIPTION = "Framework that provides credential storage and authentication service."
LICENSE = "LGPL-2.0-only"

PV = "8.60"

RPM_NAME = "libsignon-qt5-1-8.60-2.18.aarch64.rpm"
RPM_HASH = "4cc81fa7e625ca9c4881d59704a0ee52db0f56b5d6521b8fa99a5e87719a65005b4bd89fa08c276844078832cf94bfa4947ef76a69676c974678a85f93b4cf6d"

RPROVIDES:${PN} += "libsignon-qt5-1 \
libsignon-qt5-1(aarch-64) \
libsignon-qt5.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
