SUMMARY = "Boost.IOStreams Runtime Libraries"
DESCRIPTION = "This package contains the Boost.IOStreams Runtime libraries."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_iostreams1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "0c64e9d7e63e22f8efc95aa98073006f188577feb907177fdb378a97d67f725920ac8dfab69bef6c6cd6ee0f6ab4f73c5f1da5c513a5920e67de5ba111f48961"

RPROVIDES:${PN} += "libboost_iostreams.so.1.82.0()(64bit) \
libboost_iostreams1_82_0 \
libboost_iostreams1_82_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1_82_0 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
liblzma.so.5(XZ_5.2)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
