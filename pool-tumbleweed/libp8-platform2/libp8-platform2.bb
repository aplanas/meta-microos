SUMMARY = "Platform support library used by libCEC and binary add-ons for Kodi"
DESCRIPTION = "Platform support library used by libCEC and binary add-ons for Kodi."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.0.1"

RPM_NAME = "libp8-platform2-2.1.0.1-3.13.aarch64.rpm"
RPM_HASH = "ab08deffb080029a3b370cf9b3b451c9d3ebbb55490752f30c7d91e808c77b64aba60f4303f5c16e58133f48289e50d1b13b5f23d3fad0241d505bff27351625"

RPROVIDES:${PN} += "libp8-platform.so.2()(64bit) \
libp8-platform2 \
libp8-platform2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
