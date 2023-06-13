SUMMARY = "Core library for the Property editing framework"
DESCRIPTION = "The Core library for the property editing framework with editor widget similar to what is known from Qt Designer"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "libKPropertyCore3-4-3.2.0-2.21.aarch64.rpm"
RPM_HASH = "050f29d210f101ea1a435c140f1be9aa082d6380a16df9bc6ea193bf5b16b4fa4b508e24d3b6de9c40ac95601f2fd6227972c30fc3b00fc660a1d01932eb22e7"

RPROVIDES:${PN} += "libKPropertyCore3-4 \
libKPropertyCore3-4(aarch-64) \
libKPropertyCore3.so.4()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
kproperty \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
