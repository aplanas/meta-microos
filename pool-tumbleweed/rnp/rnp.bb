SUMMARY = "OpenPGP implementation fully compliant with RFC 4880"
DESCRIPTION = "RNP is a set of OpenPGP (RFC4880) tools, an alternative to GnuPG."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause"

PV = "0.16.2"

RPM_NAME = "rnp-0.16.2-1.5.aarch64.rpm"
RPM_HASH = "d2151d21325c45d247cdbcc570c751392d5b334623beed618fa94e98b160ce8d58dff5ce96f3fcb8c78bc81078f5db7bd2dba69a0ff5b4f8a2314a5d59d5e7af"

RPROVIDES:${PN} += "rnp \
rnp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libjson-c.so.5()(64bit) \
libjson-c.so.5(JSONC_0.14)(64bit) \
librnp.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm