SUMMARY = "Library for Vamp audio analysis plugins"
DESCRIPTION = "Vamp is an API for C and C++ plugins that process sampled audio data \
to produce descriptive output (measurements or semantic observations)."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "libvamp-sdk2-2.10.0-1.12.aarch64.rpm"
RPM_HASH = "08b7e26d314c7eac592826fe191f882ee6db1afeb4c623ff16e401b47c841aceacf6f9383bf0629a2b7a4afe413ab688f393d8ec1cd4781b5b053a63f9781063"

RPROVIDES:${PN} += "libvamp-sdk.so.2()(64bit) \
libvamp-sdk2 \
libvamp-sdk2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.35)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
