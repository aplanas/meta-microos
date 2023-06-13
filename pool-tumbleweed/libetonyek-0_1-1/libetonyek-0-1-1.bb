SUMMARY = "Library for parsing the Apple Keynote presentations"
DESCRIPTION = "Libetonyek is library providing ability to interpret and import Apple Keynote \
presentations into various applications."
LICENSE = "MPL-2.0"

PV = "0.1.10"

RPM_NAME = "libetonyek-0_1-1-0.1.10-1.11.aarch64.rpm"
RPM_HASH = "00c0e3698b624e84666506336a5d064f06003c3bee1b69fd69aa3addaa3c43cefe9b270be03150ce46cb218ceeef305efa24008df37915d666602e881bb46a7a"

RPROVIDES:${PN} += "libetonyek-0.1.so.1()(64bit) \
libetonyek-0_1-1 \
libetonyek-0_1-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
liblangtag.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
librevenge-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
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
libxml2.so.2(LIBXML2_2.5.2)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
