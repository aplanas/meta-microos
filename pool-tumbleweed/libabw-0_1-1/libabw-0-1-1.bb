SUMMARY = "Library for parsing the AbiWord file format structure"
DESCRIPTION = "Libabw is library providing ability to interpret and import AbiWord documents \
into various applications."
LICENSE = "MPL-2.0"

PV = "0.1.3"

RPM_NAME = "libabw-0_1-1-0.1.3-1.18.aarch64.rpm"
RPM_HASH = "638d6402ce134259c59cff72ad1955aa0b60bc86ef3223982d04f9c09ed2ae9ed51c9db5a72c93c193d9ec481318fef2f4049a1d7cd4bb7a44af47d95dba7329"

RPROVIDES:${PN} += "libabw-0.1.so.1()(64bit) \
libabw-0_1-1 \
libabw-0_1-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
librevenge-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.0)(64bit) \
libxml2.so.2(LIBXML2_2.5.2)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.17)(64bit) \
libz.so.1()(64bit)"

inherit rpm
