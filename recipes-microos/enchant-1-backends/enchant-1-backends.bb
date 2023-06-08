SUMMARY = "ISpell/Myspell backends for libenchant"
DESCRIPTION = "A library providing an efficient extensible abstraction for dealing \
with different spell checking libraries. \
 \
This package provides the ispell and myspell backends."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.1"

RPM_NAME = "enchant-1-backends-1.6.1-6.3.aarch64.rpm"
RPM_HASH = "3c648731671824df5ad94d30c10b092a0c02f8c228c4bc4fbbec5778d835f97564a12614d1911eabf5ad0e9ca668a8d764ba095b587b8396b8f7fb0f4b4b0837"

RPROVIDES:${PN} += "enchant-1-backend enchant-1-backends enchant-1-backends(aarch-64) libenchant1:/usr/lib64/enchant/libenchant_ispell.so libenchant_ispell.so()(64bit) libenchant_myspell.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libenchant.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libhunspell-1.7.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
