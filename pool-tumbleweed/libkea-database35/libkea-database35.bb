SUMMARY = "Kea database abstraction library"
DESCRIPTION = "Kea's database abstraction library."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-database35-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "10270e0bc6af925dd96d223e30c0a2ebe585b45926777c69d8ec319d34db15b8f359bfd58244df0dc1b61a374c31692ae1086d49eac9eb2035923240abc2df0e"

RPROVIDES:${PN} += "libkea-database.so.35()(64bit) \
libkea-database35 \
libkea-database35(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libkea-cc.so.39()(64bit) \
libkea-exceptions.so.13()(64bit) \
libkea-log.so.35()(64bit) \
libkea-util.so.52()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
