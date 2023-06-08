SUMMARY = "The gold linker"
DESCRIPTION = "gold is an ELF linker.	It is intended to have complete support for ELF \
and to run as fast as possible on modern systems.  For normal use it is \
a drop-in replacement for the older GNU linker."
LICENSE = "GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "binutils-gold-2.40-4.1.aarch64.rpm"
RPM_HASH = "ce53eab29e81f9c422c73ecfb2386d69640ee0760fec497cc79f717386b9748b0733d9ee9aea2d9bbbbb5952125b14723d38ab928b61f74850ccda82d87ecb78"

RPROVIDES:${PN} += "binutils-gold binutils-gold(aarch-64)"
RDEPENDS:${PN} += "/bin/sh binutils ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
