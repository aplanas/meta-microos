SUMMARY = "Singular's POLYS library"
DESCRIPTION = "Data structures and basic algorithms for polynomials \
in Singular"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libpolys-4_3_1-4.3.1.p3-1.3.aarch64.rpm"
RPM_HASH = "943cdbb5241dff9be9f86e20dd6d6a53dc1e6e312ec95668f641a22e4693eb74e6878d628dbe7a5aa6f67405fe38d789f5f6e1b0ed253e57fb664eb85cf10727"

RPROVIDES:${PN} += "libpolys-4.3.1.p3.so()(64bit) \
libpolys-4_3_1 \
libpolys-4_3_1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfactory-4.3.1.p3.so()(64bit) \
libflint.so.17()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libntl.so.44()(64bit) \
libomalloc-4.3.1.p3.so()(64bit) \
libsingular_resources-4.3.1.p3.so()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
