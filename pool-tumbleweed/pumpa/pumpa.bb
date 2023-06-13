SUMMARY = "A pump.io client written in C++/Qt"
DESCRIPTION = "Pumpa is a pump.io client written in C++ and Qt."
LICENSE = "GPL-3.0+"

PV = "0.9.3"

RPM_NAME = "pumpa-0.9.3-2.32.aarch64.rpm"
RPM_HASH = "9d0efa212a92132dbc4116c861970c4f623138f9698763c07ed71a0e6cc94e676240aa21c79bbb7580adb655b39c703a9ca40e2a114d78e2420ecbbb81ecd1e0"

RPROVIDES:${PN} += "application() \
application(pumpa.desktop) \
pumpa \
pumpa(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libtidy.so.58()(64bit)"

inherit rpm
