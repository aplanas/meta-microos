SUMMARY = "Open Path Guiding Library"
DESCRIPTION = "Open Path Guiding Library (Intel® Open PGL) implements a set of representations \
and training algorithms needed to integrate path guiding into a renderer. Open \
PGL offers implementations of current state-of-the-art path guiding methods, \
which increase the sampling quality and, therefore, the efficiency of a \
renderer."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "libopenpgl0-0.4.1-1.3.aarch64.rpm"
RPM_HASH = "3f3b7b619662d6efde76b0fac29554e2db16788e0915d61b8a07483ee3b8fb09fd1d716303ec47efe95744b46a6557290cf4e556cfe6aa9a238faf263a61d0fd"

RPROVIDES:${PN} += "libopenpgl.so.0()(64bit) \
libopenpgl0 \
libopenpgl0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtbb.so.12()(64bit)"

inherit rpm
