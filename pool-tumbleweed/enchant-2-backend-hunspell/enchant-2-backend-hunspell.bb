SUMMARY = "Hunspell backend for the Enchant spell checking library"
DESCRIPTION = "Hunspell plugin for enchant, a library providing an efficient \
extensible abstraction for dealing with different spell checking \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.15"

RPM_NAME = "enchant-2-backend-hunspell-2.2.15-3.4.aarch64.rpm"
RPM_HASH = "b4997d9d1094fb7ef3c045633636b1d92afd1a7651acfde6335201379d65dd030a1fc42384eaf4a1d17a19d83b98b5583f7e1c3daafad75ffd18fbb9dac9332e"

RPROVIDES:${PN} += "enchant-2-backend \
enchant-2-backend-hunspell \
enchant-2-backend-hunspell(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libenchant-2.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libhunspell-1.7.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
