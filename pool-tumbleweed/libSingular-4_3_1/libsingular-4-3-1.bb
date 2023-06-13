SUMMARY = "Singular's Singular library"
DESCRIPTION = "(Upstream has not provided any description.)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libSingular-4_3_1-4.3.1.p3-1.3.aarch64.rpm"
RPM_HASH = "43e68cd2c7a6251e4caa2310b47118e4a1c0d675ca62966b491b43302d0b13172b8574c81c1e0ad96837362b274a65e4c7f8520e07020989bf628ad329326952"

RPROVIDES:${PN} += "libSingular-4.3.1.p3.so()(64bit) \
libSingular-4_3_1 \
libSingular-4_3_1(aarch-64)"

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
libomalloc-4.3.1.p3.so()(64bit) \
libpolys-4.3.1.p3.so()(64bit) \
libreadline.so.8()(64bit) \
libsingular_resources-4.3.1.p3.so()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
