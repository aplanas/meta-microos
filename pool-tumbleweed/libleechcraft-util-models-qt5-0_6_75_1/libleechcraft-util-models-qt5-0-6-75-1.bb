SUMMARY = "MVC utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used models (as in MVC), \
as well as model-related classes and functions."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-models-qt5-0_6_75_1-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "f65fb0b5505673fbdac4fb61d812e4ee6eec081b0381cd20e21ad721f8ead843be381e0f6787c8805704b9509959f1875b76f7a1ecf6fbf2187df74675adc922"

RPROVIDES:${PN} += "libleechcraft-util-models-qt5-0_6_75_1 \
libleechcraft-util-models-qt5-0_6_75_1(aarch-64) \
libleechcraft-util-models-qt5.so.0.6.75.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
