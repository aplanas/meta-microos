SUMMARY = "A C++ MIME library"
DESCRIPTION = "It has been built around the standard library; there are no custom \
string classes or list implementations. Class functionalities and \
behavior is modeled around MIME and the Internet message RFCs. See \
RFC 5322, 2045 and 2046 for terminology, etc. \
2046."
LICENSE = "MIT"

PV = "0.9.8"

RPM_NAME = "libmimetic0-0.9.8-3.8.aarch64.rpm"
RPM_HASH = "80aa8c57de8c8657afdaa9d1c6e5aa7d8962948e5667b56837d5f636a69147b39e542d3f13e1ed30444cc3a25dbc304ef3042aa6a0740089ac9f7b680d53a814"

RPROVIDES:${PN} += "libmimetic.so.0()(64bit) \
libmimetic0 \
libmimetic0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
