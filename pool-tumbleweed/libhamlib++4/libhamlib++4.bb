SUMMARY = "C++ interface of the Ham Radio Control Libraries"
DESCRIPTION = "Hamlib provides a programming interface for controlling radios and \
other shack hardware. It is a software layer, not a complete user \
application."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "libhamlib++4-4.5.5-2.1.aarch64.rpm"
RPM_HASH = "361e1509ebe1488d6d2953ae39fd426e18f8c473417e173ee705aab5dd6f6cdc71f8d9c0e5f58e5a6b730c0f0eb544a1741914773842daf6cd8d63f523f36e8c"

RPROVIDES:${PN} += "libhamlib++.so.4()(64bit) \
libhamlib++4 \
libhamlib++4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libhamlib.so.4()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
