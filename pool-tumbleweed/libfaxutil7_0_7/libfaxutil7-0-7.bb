SUMMARY = "Runtime library needed by both fax server and client"
DESCRIPTION = "This runtime lib is needed by both the fax server and the client."
LICENSE = "BSD-3-Clause"

PV = "7.0.7"

RPM_NAME = "libfaxutil7_0_7-7.0.7-1.4.aarch64.rpm"
RPM_HASH = "2f11df180127944b0d8634224da818c88e12e722562ece2887005b5aaac5adb72f4b4e5a274e2ef7501179e963b5208db320858b01dcb9b565b917de006773cf"

RPROVIDES:${PN} += "libfaxutil.so.7.0.7()(64bit) \
libfaxutil7_0_7 \
libfaxutil7_0_7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
