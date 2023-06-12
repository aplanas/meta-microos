SUMMARY = "Application Binary Interface Generic Analysis and Instrumentation Library"
DESCRIPTION = "ABIGAIL constructs, manipulates, (de-)serializes ABI-relevant \
artifacts, such as types, variable, fonctions and declarations \
(collectively, the ABI corpus) of a given library or program. The \
library provides a way to compare two ABI corpuses, provide detailed \
information about their differences, and help build tools to infer \
interesting conclusions about these differences."
LICENSE = "LGPL-3.0-or-later"

PV = "2.0"

RPM_NAME = "libabigail0-2.0-1.7.aarch64.rpm"
RPM_HASH = "12d4d7c8e5f19e93ec76b99d2a81094633b6f471c29983a46375520dfb8cc0eaedad7057b784ba08cdb731d5a5d2107399e87498a8140de2522c7c04991d4dea"

RPROVIDES:${PN} += "libabigail.so.0()(64bit) \
libabigail0 \
libabigail0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdw.so.1()(64bit) \
libdw.so.1(ELFUTILS_0.122)(64bit) \
libdw.so.1(ELFUTILS_0.126)(64bit) \
libdw.so.1(ELFUTILS_0.143)(64bit) \
libdw.so.1(ELFUTILS_0.148)(64bit) \
libdw.so.1(ELFUTILS_0.159)(64bit) \
libdw.so.1(ELFUTILS_0.160)(64bit) \
libelf.so.1()(64bit) \
libelf.so.1(ELFUTILS_1.0)(64bit) \
libelf.so.1(ELFUTILS_1.1.1)(64bit) \
libelf.so.1(ELFUTILS_1.2)(64bit) \
libelf.so.1(ELFUTILS_1.5)(64bit) \
libelf.so.1(ELFUTILS_1.6)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.0)(64bit) \
libxml2.so.2(LIBXML2_2.5.7)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.7.3)(64bit)"

inherit rpm
