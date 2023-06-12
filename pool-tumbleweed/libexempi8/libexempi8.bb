SUMMARY = "XMP support library"
DESCRIPTION = "Exempi is a library for XMP parsing and I/O. XMP (Extensible Metadata \
Platform) facilitates embedding metadata in files using a subset of \
RDF. Most notably, XMP supports embedding metadata in PDF and many \
image formats."
LICENSE = "BSD-3-Clause"

PV = "2.6.3"

RPM_NAME = "libexempi8-2.6.3-1.3.aarch64.rpm"
RPM_HASH = "dcc66cb6c9e5afbe43bfdbd32f4b64f117f624d3238d0139fe1ab49565bafbf922c927f9fe318b86d2ad50d3343d633632beb52b8adcc46aa07a9ccb0a13769f"

RPROVIDES:${PN} += "libexempi.so.8()(64bit) \
libexempi8 \
libexempi8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.2)(64bit)"

inherit rpm
