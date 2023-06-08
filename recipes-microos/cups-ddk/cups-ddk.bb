SUMMARY = "CUPS Driver Development Kit"
DESCRIPTION = "The CUPS Driver Development Kit (DDK) provides \
a suite of standard drivers, a PPD file compiler, \
and other utilities that can be used to develop \
printer drivers for CUPS."
LICENSE = "Apache-2.0"

PV = "2.4.2"

RPM_NAME = "cups-ddk-2.4.2-4.3.aarch64.rpm"
RPM_HASH = "254ff666ff066bd2c6225066d9283d25ac3ca3369c9d77ca49c750c99e6acef365b2312cac195fbafa21c0412ea08efbc4483598214a4cb03e76d4f2849fb894"

RPROVIDES:${PN} += "cups-ddk cups-ddk(aarch-64) cupsddk"
RDEPENDS:${PN} += "cups cups-devel libc.so.6(GLIBC_2.34)(64bit) libcups.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
