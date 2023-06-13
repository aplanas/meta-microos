SUMMARY = "Bullet Convex Decomposition Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.17"

RPM_NAME = "libConvexDecomposition3_17-3.17-1.9.aarch64.rpm"
RPM_HASH = "269ae4cf05209f3140e1d7d85a7a645042c20c779043a2c7b0f3e49035afbe744d5087cc04de159ad05a4df2784f1ab8ff18d71625e5e65887d88a4036c5baca"

RPROVIDES:${PN} += "libConvexDecomposition.so.3.17()(64bit) \
libConvexDecomposition3_17 \
libConvexDecomposition3_17(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libLinearMath.so.3.17()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
