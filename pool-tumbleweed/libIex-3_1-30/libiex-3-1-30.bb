SUMMARY = "Exception handling library for OpenEXR"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libIex"
LICENSE = "BSD-3-Clause"

PV = "3.1.7"

RPM_NAME = "libIex-3_1-30-3.1.7-1.1.aarch64.rpm"
RPM_HASH = "c2c87465579c0f936f4b12a86bafab17702ec176c3e1aa4ddfd8f125eaaf29510a5656f773d6b173eff73210c63a907544116f7b2610cb743f5d0de1788fb97d"

RPROVIDES:${PN} += "libIex-3_1-30 \
libIex-3_1-30(aarch-64) \
libIex-3_1.so.30()(64bit)"
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
