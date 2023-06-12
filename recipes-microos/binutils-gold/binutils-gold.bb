SUMMARY = "The gold linker"
DESCRIPTION = "gold is an ELF linker.	It is intended to have complete support for ELF \
and to run as fast as possible on modern systems.  For normal use it is \
a drop-in replacement for the older GNU linker."
LICENSE = "GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "binutils-gold-2.40-5.1.aarch64.rpm"
RPM_HASH = "a6be5f2773aedf9d64d665a828270ca472f046ab79946b6f35780dce627489dc4bc1b2d79419dec7da9561f0b0e552a826ca3e43253a5d9e655c8d2c83e496bd"

RPROVIDES:${PN} += "binutils-gold \
binutils-gold(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
binutils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit) \
update-alternatives"

inherit rpm
