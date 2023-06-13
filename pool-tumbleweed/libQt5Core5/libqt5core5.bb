SUMMARY = "Qt 5 Core Library"
DESCRIPTION = "The Qt 5 Core library. It adds these features to C++: \
 \
* a mechanism for object communication called signals and slots \
* queryable and designable object properties \
* hierarchical and queryable object trees that organize \
* object ownership in a natural way with guarded pointers (QPointer) \
* a dynamic cast that works across library boundaries"
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Core5-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "4c95e3138bffe6fe305e266b5c8aae724773324db05e01cb814e14c38f7d12caedd0c6218fe1bf6f7585a83c06e6c5ffc8e6058baab56cc392b8d030518788cc"

RPROVIDES:${PN} += "libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core5 \
libQt5Core5(aarch-64) \
libqt5-qtbase"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdouble-conversion.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libpcre2-16.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
