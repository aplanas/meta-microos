SUMMARY = "Gecode minizinc solver"
DESCRIPTION = "Minizinc solver using the Gecode toolkit."
LICENSE = "MIT"

PV = "6.3.0~git20211208.6b09bea4"

RPM_NAME = "gecode-minizinc-6.3.0~git20211208.6b09bea4-1.5.aarch64.rpm"
RPM_HASH = "c6b3cabe925b8ec8e59254fc9888edd2d2a10ba4b2618a34d070973873270bf49fe8979cd6509314cf8b267079d5375b023f8b44a96bbb3e130a0658abff6348"

RPROVIDES:${PN} += "gecode-minizinc \
gecode-minizinc(aarch-64) \
libgecodeflatzinc.so.51()(64bit) \
minizinc-solver"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgecodedriver.so.51()(64bit) \
libgecodefloat.so.51()(64bit) \
libgecodeint.so.51()(64bit) \
libgecodekernel.so.51()(64bit) \
libgecodeminimodel.so.51()(64bit) \
libgecodesearch.so.51()(64bit) \
libgecodeset.so.51()(64bit) \
libgecodesupport.so.51()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
minizinc"

inherit rpm
