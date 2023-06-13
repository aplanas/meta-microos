SUMMARY = "A plug-in framework for C++"
DESCRIPTION = "C-Pluff is a plug-in framework for C++ programs."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "libcpluffxx0-0.2.0-2.8.aarch64.rpm"
RPM_HASH = "4a47848734e2db2e3950b384b96612266069bf6b48dbf66330d6e5eb7560864be2481386f3342878b7d63a6e880fdc518dc27ea47a605de252470351cf127c7a"

RPROVIDES:${PN} += "libcpluffxx.so.0()(64bit) \
libcpluffxx0 \
libcpluffxx0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libcpluff.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
