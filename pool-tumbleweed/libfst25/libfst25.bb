SUMMARY = "Development files for OpenFST"
DESCRIPTION = "OpenFST is a library for constructing, combining, optimizing and \
searching weighted finite-state transducers (FSTs). \
 \
This package requires SSE on 32-bit x86 to function."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "libfst25-1.8.2-1.1.aarch64.rpm"
RPM_HASH = "fcabce9b2635763ecb52da5859bc510abe04776807f2a89ca0f6a310687232375de94d7dce1d147b5bc5dead833f730b07192829f9fed9ea1f878d2636ce0ee2"

RPROVIDES:${PN} += "libfst.so.25()(64bit) \
libfst25 \
libfst25(aarch-64) \
libfstscript.so.25()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.23)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
